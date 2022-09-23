package day_5.p3;

import java.util.Scanner;

public class Result extends Test implements Attendance{
	Scanner scanner = new Scanner(System.in);
	double total;
	private int atten;
	int x,y;
	
	public void setAttendance() {
		System.out.print("Enter number of attendance : ");
		int att = sc.nextInt();
		this.atten = att;
	}
	public int getAttendance() {
		return atten;
	}
	public void getTotal() {
		System.out.print("Enter the number in both subject : ");
		double x=sc.nextDouble(),y=sc.nextDouble();
		setMarks(x,y);
		
		total=getMarks()+(getAttendance()>=(0.75*Atten)?atten:0);
	}
	public void display() {
		System.out.println("Total : "+total);
		System.out.println("Attendance : "+atten);
	}
}
