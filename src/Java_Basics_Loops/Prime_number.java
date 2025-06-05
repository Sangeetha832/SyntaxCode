
package Java_Basics_Loops;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		boolean isPrime = true;
		if(n<=1) {
			isPrime = false;
		}
		for(int i = 2; i<= n/2; i++) {
			if(n%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(n+" is Prime");
		}else {
			System.out.println(n+" is not prime");
		}
	}
}
