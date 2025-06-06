package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert String to Integer/Double
public class String_ToInteger {
	public static void main(String[] args) {
		List<String> prices = Arrays.asList("99.5", "100.25", "45.75");

		List<Double> list = prices.stream()
				.filter(s -> s.matches("\\d+(\\.\\d+)?"))  // matches int to decimal
				.map(Double::parseDouble)
				.collect(Collectors.toList());

		System.out.println(list);
		
        List<String> mixed = Arrays.asList("10", "Nanda", "25", "Java", "42");

        List<Integer> value = mixed.stream().filter(s -> s.matches("\\d+"))
        		.map(Integer::parseInt)
        		.collect(Collectors.toList());
        System.out.println(value);
	}
}
