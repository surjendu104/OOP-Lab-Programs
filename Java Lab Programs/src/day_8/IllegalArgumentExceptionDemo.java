package day_8;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of testscores : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		TestScore tc = new TestScore(arr);
		System.out.println(tc.ScoreAverage(arr));
		sc.close();
	}
}

class TestScore {
	int[] arr;

	public TestScore(int[] arr) {
		this.arr = arr;
	}

	double ScoreAverage(int[] arr) {
		try {
			int sum = 0;
			for (int i : arr) {
				if (i < 0 || i > 100) {
					throw new IllegalArgumentException();
				} else {
					sum += i;
				}
			}
			return sum / arr.length;
		} catch (IllegalArgumentException e) {
			System.out.println("Average can't calcutated.Illegal Argument Exception occur");
			return -1;
		}

	}
}
/*
 * 
 * Enter the number of testscores : 5 65 1000 847 3 6 Average can't
 * calcutated.Illegal Argument Exception occur -1.0
 * 
 * Enter the number of testscores : 5 -1 0 8 2 3 Average can't
 * calcutated.Illegal Argument Exception occur -1.0 Enter the number of
 * testscores : 5 8 4 8 2 9 6.0
 * 
 */
