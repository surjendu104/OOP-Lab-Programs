package day_6;


import java.util.*;

public class SortString_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String s = sc.nextLine();
		
		String[] arrOfStrings = s.strip().split(" ");
		
		for(int i=0;i<arrOfStrings.length;i++) {
			for(int j=i+1;j<arrOfStrings.length;j++ ) {
				if(arrOfStrings[i].compareTo(arrOfStrings[j])>0) {
					String temp = arrOfStrings[i];
					arrOfStrings[i] = arrOfStrings[j];
					arrOfStrings[j]=temp;
				}
			}
		}
		
		/*We can do it by inbuilt Arrays.sort() method*/
		System.out.println("Sorted sentence.....");
		for(String i:arrOfStrings)
			System.out.print(i+" ");
		
		sc.close();
	}
}
/*
 Enter the sentence : welcome to your personal dashboard
 Sorted sentence.....
 dashboard personal to welcome your 
*/
