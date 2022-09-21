package day_3.p0;

//Rectangle
import java.util.*;

class Rectangle{
	int length;
	int width;
	int calcArea(){
		return length*width;	
	}
	void display(){
		System.out.println("Area of ractangle= "+calcArea());
	}
	
	Rectangle(int l,int w){
		length=l;
		width=w;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the length and width of rectangle: ");
		//int le=sc.nextInt();
		//int wi = sc.nextInt();
		
		Rectangle rc = new Rectangle(12,45);
		rc.calcArea();
		rc.display();
	}
}

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the length and width of rectangle: ");
		//int le=sc.nextInt();
		//int wi = sc.nextInt();
		
		Rectangle rc = new Rectangle(12,45);
		rc.calcArea();
		rc.display();
	}
}