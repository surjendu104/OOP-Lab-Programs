package day_1;

import java.util.*;
public class fibbonaci_series {
	static void fibo(int n){
        int a=0,b=1;
        System.out.println("The fibonaci series upto "+n+" terms...............");
        System.out.print(a+" "+b);
        for(int i=3;i<=n;++i){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        fibo(n);
        sc.close();
    }
}
