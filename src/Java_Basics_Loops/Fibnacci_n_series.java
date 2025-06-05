package Java_Basics_Loops;

public class Fibnacci_n_series {
	public static void main(String[] args) {
		int n = 10;
		int first = 0, second = 1, next;
		for(int i = 0; i<n; i++) {
			System.out.print(first+ " ");
			next = first + second;
			first = second;
			second = next;
			
		}
	}
}
