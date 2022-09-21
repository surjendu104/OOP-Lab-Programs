package day_3.p6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		System.out.print("Enter the number of triangle: ");
        int n=sc.nextInt();
        Triangle[] triangleArray=new Triangle[n];
        
        double ans=0.0;//Taking initial as zero as area can't be negative!!
        int idx=1;
        for(int i=1;i<=n;i++){
        System.out.print("Enter the base and height of Triabgle- "+i+" : ");
        int b=sc.nextInt(),h=sc.nextInt();
        triangleArray[i] = new Triangle(b,h);
        
        if(ans<triangleArray[i].area()){
        ans=triangleArray[i].area();
        idx=i;
        }
        }
        System.out.println("Max Area Triangel is :: Triangle- "+idx+"\nMaximum Area: "+ans );
        sc.close();
}
}
