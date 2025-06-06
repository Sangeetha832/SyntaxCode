package Functional_Interface;

import java.util.function.Predicate;

public class Predicate_functional {
	public static void main(String[] args) {
		Predicate<String> islong = s -> s.length() >5;
		
		System.out.println(islong.test("hello"));
		System.out.println(islong.test("welcome"));
	}
}
