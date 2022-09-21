package day_4.p4;

import java.util.Scanner;
import java.util.regex.Pattern;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee No.(Example: 123D): ");
        String num = sc.next();
        if(Pattern.matches("[0-9]+[A-M]+", num) && num.length() == 4){
            TeamLeader ob = new TeamLeader("Rabi Kumar Biswas",num,"15.06.2021",1,300.50,2000.40,30.00,34.00);
            ob.display2();
        }else
            System.out.println("Invalid Employee number");
        sc.close();
    }
}