package Java_Basics_Conditions;

public class Grade_calc {
	public static void main(String[] args) {
		int n = 70;
		if(n < 100 && n >= 90) {
			System.out.println("Grade A");
		}else if(n < 90 && n >= 70) {
			System.out.println("Grade B");
		}else if(n <70 && n>= 50) {
			System.out.println("Grade C");
		}else if( n < 50) {
			System.out.println("Grade D");
		}
	}
}
