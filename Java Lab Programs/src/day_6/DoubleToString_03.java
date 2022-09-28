package day_6;

import java.util.Scanner;

public class DoubleToString_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the double number : ");
		double num = in.nextDouble();
		
		String ans = Double.toString(num);
		
		System.out.println("String : "+ans);
		in.close();
	}
}

/*
Enter the double number : 56.084894064
String : 56.084894064
*/