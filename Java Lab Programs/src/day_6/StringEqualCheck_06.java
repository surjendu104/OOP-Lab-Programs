package day_6;

import java.util.Scanner;

public class StringEqualCheck_06 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the both the string : ");
		String s1=in.next(),s2 =in.next();
		
		if(s1.equals(s2))System.out.println("Strings are equal");
		else System.out.println("Strings ate not equal");
		in.close();
	}
}


/*
out-1

Enter the both the string : 
Hello
Hello
Strings are equal

out-2

Enter the both the string : 
Hello
Hi
Strings ate not equal


*/


