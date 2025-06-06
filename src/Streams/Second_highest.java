package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Second_highest {
public static void main(String[] args) {
	List<Integer> salary = Arrays.asList(2000, 3000, 1000, 4000, 8797,3748,234, 784);
	Optional<Integer> value = salary.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	value.ifPresent(s -> System.out.println(s));
}
}
