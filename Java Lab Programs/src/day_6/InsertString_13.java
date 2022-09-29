package day_6;

import java.util.Scanner;

public class InsertString_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the main string and String to be insert");
		String str = sc.next();
		String subStr = sc.next();
		str=subStr+str;
		
		System.out.println("Afetr insertion at beginig : "+str);
		
		sc.close();
	}
}

/*
Enter the main string and String to be insert
mone
Dore
Afetr insertion at beginig : Doremone

*/