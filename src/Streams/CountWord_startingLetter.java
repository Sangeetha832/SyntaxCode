package Streams;

import java.util.Arrays;
import java.util.List;

public class CountWord_startingLetter {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Rachael","Ross","Monica","Chandler","Joey","Phoebe");
		long countLetter = list.stream().filter(w -> w.startsWith("R")).count();
		System.out.println(countLetter);
	}
}
