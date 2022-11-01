package day_8;

import java.util.Scanner;

public class ArrayIndexOutOfBoundDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of element : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the index you want to access : ");
		int x = sc.nextInt();
		try {
			int ans = arr[x];
			System.out.println("Element in index " + x + " is : " + ans);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound occurred!! Enter valid index");
		}
		sc.close();
	}
}
/*
 * Enter the number of element : 5 5 9 7 1 6 Enter the index you want to access
 * : 6 Array index out of bound occurred!! Enter valid index
 */
