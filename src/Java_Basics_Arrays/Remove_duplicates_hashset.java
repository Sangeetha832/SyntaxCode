package Java_Basics_Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Remove_duplicates_hashset {
	public static void main(String[] args) {
		Integer[] aa = {12, 85, 12, 47, 54, 85, 47, 29, 38};
		int [] arr = {12, 85, 12, 47, 54, 85, 47, 29, 38};
		HashSet<Integer> dup = new HashSet<>(Arrays.asList(aa));
//		System.out.println(dup);
		Set<Integer> unique = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		
		System.out.println(unique);
			}
}
