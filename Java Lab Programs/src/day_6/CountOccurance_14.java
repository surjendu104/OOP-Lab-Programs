package day_6;

import java.util.Scanner;

public class CountOccurance_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		System.out.println("Enter the sub string");
		String subStr = sc.nextLine();
		int count=0,idx=0;
//		
		while(true) {
			idx = str.indexOf(subStr, idx);
			if(idx!=-1) {
				count++;
				idx++;
			}
			else {
				System.out.println("Number of occurance : "+count);
				break;
			}
		}
		
		sc.close();
	}
}
/*
Enter the string 
Naman is the student at RCCIIT. He is one of the best student in college
Enter the sub string
student
Number of occurance : 2
*/
