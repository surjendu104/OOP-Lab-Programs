package day_1;

import java.util.Scanner;

public class primeNumber {
	static void prime(int l, int r) {
        for (int i = l; i <= r; i++) {
            if (i == 0 || i == 1)
                continue;
            int f = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    f = 0;
                    break;
                }

            }
            if (f == 1) {
                System.out.print(" " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int l = sc.nextInt();

        System.out.println("Enter the upper limit: ");
        int r = sc.nextInt();

        prime(l, r);
        sc.close();

    }
}
