package day_2;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.print("Enter the elements: ");
        
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min])min=j;
            }
            
            int temp =a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
            
        }
        
    }
}
