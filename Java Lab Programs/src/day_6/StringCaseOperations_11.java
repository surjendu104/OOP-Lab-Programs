package day_6;

import java.util.Scanner;

public class StringCaseOperations_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str= sc.nextLine();
		
		System.out.println("Uppercase : "+str.toUpperCase());
		System.out.println("Lowercase : "+str.toLowerCase());
		
		char[] toggleString=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				toggleString[i] = (char)(str.charAt(i)^(1<<5));
			}else toggleString[i]=str.charAt(i);
		}
		
		System.out.println("Toggle String : "+String.valueOf(toggleString));
		
		sc.close();
	}
}
/*
Enter the string : 
Surjendu Pal
Uppercase : SURJENDU PAL
Lowercase : surjendu pal
Toggle String : sURJENDU pAL
*/