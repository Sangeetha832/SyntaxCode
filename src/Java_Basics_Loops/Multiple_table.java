package Java_Basics_Loops;

public class Multiple_table {
	public static void main(String[] args) {
		int n = 10;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.println(i+" tables are "+ j+" * "+i+" = "+j*i);
			}
			System.out.println("****************************");
		}
	}
}
