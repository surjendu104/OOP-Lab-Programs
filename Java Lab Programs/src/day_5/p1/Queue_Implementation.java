package day_5.p1;

import java.util.Scanner;

public class Queue_Implementation implements Queue{
	public final int size = 100;
	static int  rare=-1,front = -1;
	int[] arr = new int[size];
	Scanner scanner  = new Scanner(System.in);
	public void insert(int num) {
		if(rare ==size-1) {
			System.out.println("Overflow");
			return;
		}
		if(front==-1)front=0;
		rare++;
		arr[rare] = num;
		
	}
	public void delete() {
		if(front==-1 || front>rare) {
			System.out.println("Underflow");
			return;
		}
		System.out.println("Element deleted from queue : "+arr[front]);
		front+=1;
	}
	public void display() {
		if(front==-1) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Printing Queue");
		for(int i=front;i<=rare;i++) {
			System.out.println("Element - "+i+" : "+arr[i]);
		}
		
	}


}
