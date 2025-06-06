package Functional_Interface;

@FunctionalInterface
interface Calculator{
	//defining abstract method
	int doOperation(int num1, int num2);
	//defining default method
	default boolean checkValues(int num1, int num2) {
		return (num1>0 && num2>0);
	}
}

public class funtional_interface implements Calculator {
	//implementing abstract method
	public int doOperation(int num1, int num2) {
		return num1+num2;
	}
	public static void main(String[] args) {
		Calculator cal = new funtional_interface();
		//executing default method
		System.out.println(cal.checkValues(5,6));
		//executing implemented abstract method
		System.out.println(cal.doOperation(5, 6));
	}
}
