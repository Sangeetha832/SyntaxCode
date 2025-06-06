package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
	public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<Object, Long> count = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(count);
        
        words.stream().forEach(word -> System.out.println(word+"-"+word.length()));
	}
}
