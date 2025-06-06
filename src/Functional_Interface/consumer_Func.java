package Functional_Interface;

import java.util.function.Consumer;

public class consumer_Func {
	public static void main(String[] args) {
		Consumer<String> msg = name -> System.out.println("Hi "+name+" !");
		msg.accept("Jack");
	}
}
