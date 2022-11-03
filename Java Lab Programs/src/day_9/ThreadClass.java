/**
 * Credit : Jayanta Roy
 */

package day_9;

public class ThreadClass {
	public static int N = 2;

	public static Object syncher = new Object();
	public static int state = 0;

	public static void main(String[] args) {
		Thread t1 = new Thread(new MatchStick());
		Thread t2 = new Thread(new MatchBox());

		t1.start();
		t2.start();
	}
}

class MatchStick implements Runnable {
	public void run() {
		for (int i = 0; i < ThreadClass.N; i++) {
			synchronized (ThreadClass.syncher) {
				try {
					while (ThreadClass.state == 1) {
						ThreadClass.syncher.wait();
					}
				} catch (InterruptedException e) {
				}

				for (int j = 1; j <= 20; j++) {
					System.out.print("MS" + j + ",");
				}
				ThreadClass.state = 1;
				ThreadClass.syncher.notify();
			}
		}
	}
}

class MatchBox implements Runnable {
	public void run() {
		for (int i = 1; i <= ThreadClass.N; i++) {
			synchronized (ThreadClass.syncher) {
				try {
					while (ThreadClass.state == 0) {
						ThreadClass.syncher.wait();
					}
				} catch (InterruptedException e) {
				}
				System.out.println("\nMB" + i);
				ThreadClass.state = 0;
				ThreadClass.syncher.notify();
			}
		}
	}
}
/*
 * MS1,MS2,MS3,MS4,MS5,MS6,MS7,MS8,MS9,MS10,MS11,MS12,MS13,MS14,MS15,MS16,MS17,
 * MS18,MS19,MS20, MB1
 * MS1,MS2,MS3,MS4,MS5,MS6,MS7,MS8,MS9,MS10,MS11,MS12,MS13,MS14,MS15,MS16,MS17,
 * MS18,MS19,MS20, MB2
 */
