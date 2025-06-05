package Java_Basics_Arrays;

import java.util.Arrays;

public class Sorted_ascending_array {
	public static void main(String[] args) {
		int[] arr = {12, 323, 3249, 32, 93,78};
		Arrays.sort(arr);
		for(int sort: arr) {
			System.out.print(sort+" ");
		}
		int[] sort = Arrays.stream(arr).sorted().toArray();
		System.out.println("using stream"+Arrays.toString(sort));
	}
}
