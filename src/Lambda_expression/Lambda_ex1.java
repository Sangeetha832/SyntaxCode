package Lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda_ex1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Banana","Orange", "Apple", "Mango");
		
		Collections.sort(list, (a,b) -> a.compareTo(b));
		System.out.println(list);
		
	}
}
