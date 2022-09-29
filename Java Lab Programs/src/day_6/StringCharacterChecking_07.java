package day_6;

import java.util.Scanner;

public class StringCharacterChecking_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String s = sc.next();
		boolean ans1 = s.contains("a");
		boolean ans2 = s.contains("A");
		if(ans1|| ans2)System.out.println("Present");
		else System.out.println("Not Present");
		
		sc.close();
	}
}

/*
Output-1
Enter the string : Mango
Present

Output-2
Enter the string : School
Not Present
*/