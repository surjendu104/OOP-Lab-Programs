/**
 * Credit : Jayanta Roy
 */

package day_9;

public class ThreadDemo2 {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		};

		t1.start();
		System.out.println("Terminating");
	}
}
/*
 * Terminating 1 2 3 4 5 6 7 8 9 10
 */