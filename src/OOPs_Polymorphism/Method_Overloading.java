package OOPs_Polymorphism;

class calculation{
	int add(int a, int b) {
		return a+b;
	}
	double sub(double a, int b) {
		return a-b;
	}
	int multi(int a, int b, int c) {
		return a*b*c;
	}
	double div(double a, double b) {
		return a/b;
	}
}
public class Method_Overloading {
	public static void main(String[] args) {
		calculation cal = new calculation();
		System.out.println(cal.add(2, 4));
		System.out.println(cal.sub(90, 2));
		System.out.println(cal.div(88, 77));
		System.out.println(cal.multi(32, 21, 43));
	}
}
