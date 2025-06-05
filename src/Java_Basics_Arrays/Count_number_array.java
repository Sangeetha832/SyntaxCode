package Java_Basics_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Count_number_array {
	public static void main(String[] args) {
		int[] arr = {21,23,34,45,56,67,78};
//		int n = arr.length;
//		int odd =0; int even =0;
//		for(int i = 0; i<n;i++) {
//			if(arr[i]%2 == 0) {
//				even++;
//			}else {
//				odd++;
//			}
//		}
//		System.out.println("odd count "+odd+" and even count "+even);
		
		long odd = Arrays.stream(arr).filter(n -> n%2 != 0).count();
		long even = Arrays.stream(arr).filter(n -> n%2 == 0).count();
		System.out.println("odd count "+odd);
		System.out.println("even count "+even);
//		 System.out.println(Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()));
		Arrays.sort(arr);
		for(int num : arr){
			System.out.print(num+" ");
		}
		 
	}
}
