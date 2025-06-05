package Java_Basics;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		Scanner sccan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sccan.nextInt();
		if(a%2 == 0) {
			System.out.println(a+" is a even number");
		}else {
		System.out.println(a+" is a odd number");
		}
	}
}
