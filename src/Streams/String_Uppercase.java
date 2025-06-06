package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_Uppercase {
	public static void main(String[] args) {
		List<String> lists = Arrays.asList("Rachael","Ross","Monica","Chandler","Joey","Phoebe");
		
		List<String> uppercase = lists.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(uppercase);
		
		lists.stream().map(u -> u.toUpperCase()).forEach(u -> System.out.print(u+" "));
		System.out.println();
		lists.stream().filter(l -> l.length() > 5).forEach(l -> System.out.print(l+" "));
		System.out.println();
		lists.stream().sorted().forEach(s -> System.out.println(s));
		
		
	}
}
