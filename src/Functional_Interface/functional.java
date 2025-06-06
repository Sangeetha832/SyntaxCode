package Functional_Interface;

import java.util.function.Function;

public class functional {
	public static void main(String[] args) {
		Function<String, Integer> lengthFunc = s -> s.length();
		
		System.out.println(lengthFunc.apply("Hello"));
	}
}
