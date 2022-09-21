package day_2;

import java.util.*;

class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Enter two number\n2. Addition\n3. Subtraction\n4. Multiplication\n5. Division\n6. Exit");
        int a=0,b=0;
        int choice=1;
        do{
            System.out.print("Enter your chooice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter two number :");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    break;
                case 2:
                    System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
                    break;
                case 3:
                    System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
                    break;
                case 4:
                    System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
                    break;
                case 5:
                    System.out.println("Division of "+a+" and "+b+" is "+(a/b));
                    break;
                }
        }while(choice!=6);
    }
}