package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Asha", "Ram", "Anu", "Krishna");
        Map<Integer, List<String>> grouped = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
	}
}
