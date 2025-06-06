package Streams;

import java.util.Arrays;
import java.util.List;

public class check_any {
	public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana","banana", "cherry");
        boolean startA = items.stream().anyMatch(s -> s.startsWith("a"));
        boolean alla = items.stream().allMatch(s -> s.startsWith("b"));
        boolean noneX = items.stream().noneMatch(s -> s.startsWith("s"));
        
        System.out.println(startA);
        System.out.println(alla);
        System.out.println(noneX);
	}
}
