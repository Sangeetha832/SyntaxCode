package Functional_Interface;

// Funtional intterface using lambda expressions
interface MyFuctionalInterface{
	void great();
}
public class Ex_FunctionalInterface {
	public static void main(String[] args) {
		MyFuctionalInterface message = ()->System.out.println("Hello Lambda");
		message.great();
	}
}
