package Functional_Interface;

import java.util.function.Supplier;

public class supplier_func {
	public static void main(String[] args) {
		Supplier<String> msg = () -> "I am Supplier Functional Interface";
		
		System.out.println(msg.get());
	}
}
