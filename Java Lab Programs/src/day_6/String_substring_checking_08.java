package day_6;

import java.util.Scanner;

public class String_substring_checking_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string and substring: ");
		String str = sc.next();
		String substr = sc.next();
		
		int n=substr.length();
		
		String checker = str.substring(0, n);
		if(checker.compareTo(substr)==0)System.out.println("Main string starts with : "+substr);
		else System.out.println("Main string doesn't starts with : "+substr);
		
		sc.close();
	}
}

/*
Enter the string and substring: Impossible
Im
Main string starts with : Im
------------------------------
Enter the string and substring: Impossible
In
Main string doesn't starts with : In

*/