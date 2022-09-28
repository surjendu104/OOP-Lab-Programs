package day_6;

import java.util.Scanner;

public class StringLengthExceptWhitespace_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = in.nextLine();
		
		s = s.replaceAll(" ","");
		System.out.println("Length of the string without space : "+s.length());
		
		in.close();
	}
}

/* Output
   Enter the string : ab abb   a bacd sd
   Length of the string without space : 12
  */
