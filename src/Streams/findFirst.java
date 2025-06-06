package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findFirst {
	public static void main(String[] args) {
        List<String> list = Arrays.asList("cat", "dog", "elephant", "cow");
        Optional<String> result = list.stream().filter(l -> l.length() >3).findFirst();
        result.ifPresent(System.out::println);
	}
}
