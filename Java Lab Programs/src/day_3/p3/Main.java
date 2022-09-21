package day_3.p3;

public class Main {
	public static void main(String[] args) {
		Box b1=new Box(5,12,3);
        Box b2=new Box(2,89,4);
        b1.volume();
        b1.display();
        b2.volume();
        b2.display();
        b1.compareVolume(b1,b2);
	}
}
