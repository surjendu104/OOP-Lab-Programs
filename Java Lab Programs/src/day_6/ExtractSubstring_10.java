package day_6;

import java.util.Scanner;

public class ExtractSubstring_10 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string with atleast 10 character : ");
		String str = sc.nextLine();
		System.out.println("Extracted 4th to 10th character is : "+str.substring(4-1, 10-1));
		
		sc.close();
		
	}
}
/*
Enter the string with atleast 10 character : 
Surjedu Pal
Extracted 4th to 10th character is : jedu P
*/