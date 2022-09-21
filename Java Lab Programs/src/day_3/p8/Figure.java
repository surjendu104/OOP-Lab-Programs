package day_3.p8;

public class Figure {
	double area;
	 
    // cube
    Figure(double r) {
        area = 6.0 * Math.pow(r, 2);
    }
 
    // cylinder
    Figure(double r, double h) {
        area = 2.0 * Math.PI * (r + h);
    }
 
    Figure(int r) {
        area = 4 * Math.PI * Math.pow(r, 2);
    }
 
    // sphere
    void result() {
        System.out.println("Calculated Area is : " + area);
    }
}
