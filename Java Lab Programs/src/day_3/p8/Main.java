package day_3.p8;

public class Main {
	public static void main(String[] args) {
		Figure cube = new Figure(4.5);
        Figure cylinder = new Figure(5.6, 4);
        Figure sphere = new Figure(5);
        
        cube.result();
        cylinder.result();
        sphere.result();
	}
}
