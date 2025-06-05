package Java_Basics;

import java.util.Scanner;

public class Calc {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the two Integers");
	int a  =  scan.nextInt();
	int b =  scan. nextInt();
	
	System.out.println("Sum of a and b = "+(a+b));
	System.out.println("subraction of a and b = "+(a-b));
	System.out.println("Divion of a and b = "+(a/b));
	System.out.println("Multiplies of a and b = "+(a*b));
}
}
