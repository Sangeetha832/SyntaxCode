package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestString {
	public static void main(String[] args) {
		List<String> high = Arrays.asList("array","optionals","list","comparator","string");
		Optional<String> value = high.stream().max(Comparator.comparingInt(String::length));
		value.ifPresent(h -> System.out.println(h));
	}
}
