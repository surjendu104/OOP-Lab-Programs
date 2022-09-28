package day_6;

import java.util.Scanner;

public class SuffixChecking_05 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the both the string : ");
		String s1=in.next(),s2 =in.next();
		int m=s1.length(),n=s2.length();
		if(m>n && s2.compareTo(s1.substring(m-n, m))==0) {
				System.out.println("String $"+s2+"$ is a suffix of string $"+s1+"$");
		}else if(m<n && s1.compareTo(s2.substring(n-m, n))==0){
				System.out.println("String $"+s1+"$ is a suffix of string $"+s2+"$");
		}else {
			System.out.println("Both string are not suffix to each other");
		}
		
		in.close();
	}
}

/*
out-1
Enter the both the string : 
useful
ful
String $ful$ is a suffix of string $useful$

out-2
Enter the both the string : 
ment
statement
String $ment$ is a suffix of string $statement$

out-3
Enter the both the string : 
creation
hi
Both string are not suffix to each other
*/
