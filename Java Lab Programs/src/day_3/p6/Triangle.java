package day_3.p6;

public class Triangle {
	int base;
    int height;
 
    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
 
    double area() {
        return 0.5 * base * height;
    }
}
