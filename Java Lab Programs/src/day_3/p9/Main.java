package day_3.p9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestScores exam1 = new TestScores();
        System.out.print("Enter the testScore-1: ");
        int te1 = sc.nextInt();
        exam1.setT1(te1);
        System.out.print("Enter the testScore-2: ");
        int te2 = sc.nextInt();
        exam1.setT2(te2);
        System.out.print("Enter the testScore-3: ");
        int te3 = sc.nextInt();
        exam1.setT3(te3);
        System.out.println("Avarage of test score is : " + exam1.Avarage());

        sc.close();
	}
}
