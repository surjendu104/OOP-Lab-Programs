package day_4.p3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee No.(Example: 123D): ");
        String num = sc.next();
        if(Pattern.matches("[0-9]+[A-M]+", num) && num.length() == 4){
            ShiftSupervisor ob = new ShiftSupervisor("Manoj Ghosh",num,"14.06.2019",480000.90,15000.50);
            ob.display1();
        }else
            System.out.println("Invalid Employee number");
        sc.close();
    }
}
