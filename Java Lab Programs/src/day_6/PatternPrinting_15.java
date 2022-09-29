package day_6;

import java.util.Scanner;

public class PatternPrinting_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		
		int n=s.length();
		System.out.println("Pattern - 1");
		for(int i=0;i<=n;i++) {
			System.out.println(s.substring(0,i));
		}
		
		System.out.println("\nPattern - 2");
		for(int i=0;i<=n;i++) {
			System.out.println(s.substring(0,i));
		}
		for(int i=n-1;i>=0;i--	) {
			System.out.println(s.substring(0,i));
		}
	}
}
/*
Enter the String
HELLO
Pattern - 1

H
HE
HEL
HELL
HELLO

Pattern - 2

H
HE
HEL
HELL
HELLO
HELL
HEL
HE
H

*/