package day_3.p7;

public class SquareAndRectangle {
	double area;
    int f;
 
    SquareAndRectangle(double a) {
        area = Math.pow(a, 2);
        f = 1;
    }
 
    SquareAndRectangle(double a, double b) {
        area = a * b;
        f = 2;
    }
 
    void display() {
        if (f == 1)
            System.out.println("Area of the square is : " + area);
        else
            System.out.println("Area of the rectangle is : " + area);
 
    }
}
