package Java_Basics_Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class min_max_array {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(23,88, 73,90,17);
	Optional<Integer> max = list.stream().max(Comparator.comparingInt(Integer:: intValue));
	max.ifPresent(m -> System.out.println(m));
	Optional<Integer> min = list.stream().min(Comparator.comparingInt(Integer::intValue));
	min.ifPresent(n-> System.out.println(n));
}
}
