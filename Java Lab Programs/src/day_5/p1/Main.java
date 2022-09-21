package day_5.p1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue_Implementation q = new Queue_Implementation();
		int choice = 1;
		
		do {
			System.out.println("1. Insert \n2. Delete \n3. Display\n4. Exit");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice){
				case 1: {
					System.out.print("Enter number to insert : ");
					int num = sc.nextInt();
					q.insert(num);
					break;
				}
				case 2:{
					q.delete();
					break;
				}
				case 3:{
					q.display();
					break;
				}
			}
			
		} while (choice!=4);
		sc.close();
	}
}
