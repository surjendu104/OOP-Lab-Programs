package day_5.p3;

public class Test extends Student{
	private double sub1,sub2;
	public void setMarks(double sub1,double sub2) {
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	
	public double getMarks() {
		System.out.println("Marks in subject 1 : "+sub1+"\nMarks in subject 2 : "+sub2);
		return sub1+sub2;
	}
}
