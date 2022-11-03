/**
 * Credit : Jayanta Roy
 */

package day_9;

public class ThreadDemo1 {

	public static Object syncher = new Object();
	public static int state = 0;

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (char i = 'A'; i <= 'Z';) {
					synchronized (ThreadDemo1.syncher) {
						try {
							while (ThreadDemo1.state == 1) {
								ThreadDemo1.syncher.wait();
							}
						} catch (InterruptedException e) {
						}
						for (int j = 1; j <= 5 && i <= 'Z'; j++, i++) {
							System.out.print(i + ",");
						}
						ThreadDemo1.state = 1;
						ThreadDemo1.syncher.notify();
					}
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 26;) {
					synchronized (ThreadDemo1.syncher) {
						try {
							while (ThreadDemo1.state == 0) {
								ThreadDemo1.syncher.wait();
							}
						} catch (InterruptedException e) {
						}
						for (int j = 1; j <= 5 && i <= 26; j++, i++) {
							System.out.print(i + ",");
						}
						ThreadDemo1.state = 0;
						ThreadDemo1.syncher.notify();
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}

// A,B,C,D,E,1,2,3,4,5,F,G,H,I,J,6,7,8,9,10,K,L,M,N,O,11,12,13,14,15,P,Q,R,S,T,16,17,18,19,20,U,V,W,X,Y,21,22,23,24,25,Z,26,