package day_1;

import java.util.Scanner;

public class sumOfAvarage {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();

        int sum=num1+num2;
        double average = ((double)sum)/2;

        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
        System.out.println("The Average of "+num1+" "+num2+" is "+average);
        sc.close(); 
    }
}
