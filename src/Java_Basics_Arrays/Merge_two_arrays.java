package Java_Basics_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Merge_two_arrays {
	public static void main(String[] args) {
//		Integer[] arr1 = {12,32,43,78,65};
//		Integer[] arr2 = {76,46,98,53,14};
//		Integer[] merge = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray(Integer[]::new);
//		
//		System.out.println(Arrays.toString(merge));
		
		List<Integer> list = Arrays.asList(23, 88, 73, 90, 17);
	      List<Integer> list1 = Arrays.asList(23, 88, 73,89,35, 90, 17);
	    List<Integer> merge = new ArrayList<>(list);
	    merge.addAll(list1);
	    System.out.println(merge);
//	  System.out.println(  list.addAll(list1));
	}
}
