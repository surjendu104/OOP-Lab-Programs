package day_5.p4;

import java.util.Scanner;

public class Circle extends Shape{
	Scanner sc = new Scanner(System.in);
	private int radius;
	void setRadius() {
		System.out.print("Enter the radius of the circle : ");
		int r=sc.nextInt();
		this.radius = r;
	}
	public int getRadius() {
		return radius;
	}
	public void calculateArea() {
		double area = Math.PI*Math.pow(getRadius(), 2);
		System.out.println("Area of circle of radius "+getRadius()+" is : "+area);
	}
}
