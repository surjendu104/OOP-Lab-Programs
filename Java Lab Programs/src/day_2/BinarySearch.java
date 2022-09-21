package day_2;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.print("Enter the elements: ");
        
        //int mini =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]<target)
                low=mid;
            else if(a[mid]>target)
                high=mid-1;
            else{   
                System.out.println("Element found at position "+mid);
                break;
                }
        }
        
        //System.out.println("Minimum element in array is: "+mini);
    }
}
