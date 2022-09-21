package day_2;

import java.util.Scanner;

public class MinimumInArray {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.print("Enter the elements: ");
        
        int mini =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i]<mini)mini=a[i];
        }
        
        System.out.println("Minimum element in array is: "+mini);
    }
}
