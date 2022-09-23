package day_5.p3;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	private int RollNo;
	
	public void setRoll() {
		System.out.print("Enter the roll number : ");
		int r = sc.nextInt();
		this.RollNo = r;
	}
	
	public void getRoll() {
		System.out.println("Your roll number is : "+RollNo);
	}
	
}
