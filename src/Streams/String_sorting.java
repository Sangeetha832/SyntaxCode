package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class String_sorting {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Rachael","Ross","Monica","Chandler","Joey","Phoebe");
		List<String> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		Collections.sort(list);
	}
}
