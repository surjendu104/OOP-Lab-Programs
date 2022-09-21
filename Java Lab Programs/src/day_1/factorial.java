package day_1;

import java.util.Scanner;

public class factorial {
	static int fac(int n){
        if(n==0 || n==1)return 1;
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        System.out.println("The factorial of "+n+" is : "+fac(n));
        sc.close();
    }
}
