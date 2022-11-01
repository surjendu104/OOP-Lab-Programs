package day_8;

import java.util.Scanner;

public class CustomException {
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
					throw new InvalidTestScore("Average can't calcutated.Illegal Argument Exception occur");
				} else {
					sum += i;
				}
			}
			return sum / arr.length;
		} catch (InvalidTestScore e) {
			System.out.println(e.getMessage());
			return -1;
		}

	}
}

class InvalidTestScore extends Exception {
	public InvalidTestScore(String s) {
		super(s);
	}
}
/*
 * out-1 Enter the number of testscores : 5 
 * 8 5454 71 2 5 
 * Average can't calcutated.Illegal Argument Exception occur 
 * -1.0
 * 
 * out-2 
 * Enter the number of testscores : 5 
 * 9 8 1 8 2 
 * 5.0
 */