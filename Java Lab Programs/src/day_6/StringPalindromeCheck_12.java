package day_6;

import java.util.Scanner;

public class StringPalindromeCheck_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		String revStr="";
		for(int i=0;i<str.length();i++)revStr =str.charAt(i)+revStr;
		
		if(revStr.equals(str))System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
		
		sc.close();
	}
	
}

/*
Enter the String : madam
Palindrome

Enter the String : hello
Not Palindrome

*/