package Java_Basics_Conditions;

import java.util.Scanner;

public class Check_Positive {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = scan.nextInt();
	
	if(n>0) {
		System.out.println("The given number is positive");
	}else if(n<0) {
		System.out.println("The given number is negative");
	}else if(n==0) {
		System.out.println("The given number is zero");
	}
}
}
