package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streams_ex1 {
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>(List.of("Banana","Orange", "Apple", "Mango"));
//		Map<String, Integer> occurance = names.stream().map(String::toLowerCase).collect(Collectors.groupingBy(null))
				
				Map<String, Integer> occurence = names.stream()
                .map(String::toUpperCase)
                        .collect(Collectors.groupingBy(Function.identity(),
                                Collectors.collectingAndThen(Collectors.counting(),Long::intValue)));
        System.out.println(occurence);
	}
}
