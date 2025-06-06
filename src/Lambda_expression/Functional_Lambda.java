package Lambda_expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional_Lambda {
	public static void main(String[] args) {
		Function<Integer, Integer> result = (value) -> value*value*value;
		Integer cube = result.apply(2);
		System.out.println(cube);
		
		Predicate<Integer> check = (age) -> age >18;
		System.out.println(check.test(19));
		
		Consumer<Integer> list = (value) -> System.out.print(value+" ");
		
		List<Integer> lists = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		for(int i: lists) {
			list.accept(i*i);
		}
		
		Supplier<Double> randomNum = () -> Math.random()*100;
		for(int i = 0 ;i < 5; i++) {
			System.out.println(randomNum.get());
		}
		
		Function<Integer, String> checkage = (var age) -> age >18 ? "ok":"not ok";
		String res = checkage.apply(21);
		
		System.out.println(res);
	}
}
