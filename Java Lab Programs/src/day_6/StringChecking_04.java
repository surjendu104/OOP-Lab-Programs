package day_6;

import java.util.Scanner;

public class StringChecking_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s=in.nextLine();
		
		boolean charFlag=false,digitFlag = false;
		char[] ch = s.toCharArray();
		
		for(char c:ch) {
			if(Character.isDigit(c))digitFlag=true;
			if(Character.isAlphabetic(c))charFlag=true;
		}
		if(!charFlag)System.out.println("String contains only digit");
		if(!digitFlag)System.out.println("String contains only character");
		if(charFlag & digitFlag)System.out.println("String contains both character and digit");
		
		in.close();
	}
}

/*
 Output
 Enter the string : 99sd4sdv4
 String contains both character and digit
 
 output-2
 Enter the string : Ram
 String contains only character
 
 output-3
 Enter the string : 700078
 String contains only digit


 */
