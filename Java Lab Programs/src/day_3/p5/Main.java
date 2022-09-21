package day_3.p5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          Payroll emp1 = new Payroll("Savan", 444);
          System.out.println("Enter the rate: ");
          double rate = sc.nextInt();
          emp1.setRate(rate);
          System.out.println("Enter the working hour: ");
          double workedHour = sc.nextInt();
          emp1.setWorkedHour(workedHour);
          System.out.println("Gross Pay: " + emp1.grossPay());
          sc.close();
    }
}