package Java_Basics;

import java.util.Scanner;

public class ReadName {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the name");
		String name = scan.next();
		System.out.println("Hello "+name);
	}
}
