package Lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sorting_lambda {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Rachael","Ross","Monica","Chandler","Joey","Phoebe");
		
			System.out.println("Sorting done by Collections.sort(): ");
			Collections.sort(nameList);
			System.out.println(nameList);
			
			System.out.println();
			
			// Sorting using list.sort() : sorting using natural order
			
			List<String> clonedName1 = new ArrayList<String>(nameList);
			//Lambda Expression for sorting the list in Natural Order
			Comparator<String> criteria = (str1, str2) -> str1.compareTo(str2);
			
			clonedName1.sort(criteria);
			System.out.println(clonedName1);
			System.out.println();
			
			/**
			 *      Sorting Using list.sort() #2 : Sorting on the basis of Length of Elements 
			 **/
	        
			//Lambda Expression for sorting the list on the basis of Length:
			List<String> clonedName2 = new ArrayList<String>(nameList);
			
	        System.out.println("Sorting done by list.sort() on the basis of Length: ");
	        
	        clonedName2.sort((str1, str2) -> str1.length() -str2.length());
	        System.out.println(clonedName2);
	        System.out.println();
	        
	        /**
			 *     Sorting Using list.sort() #3 : Sorting on the basis of First Character of Elements 
			 **/
	        List<String> clonedName3 = new ArrayList<String>(nameList);
	        //Lambda Expression for sorting the list on the basis of First Character
	        System.out.println("Sorting done by list.sort() on the basis of First Character: ");
	        clonedName3.sort((str1,str2) -> str1.charAt(0) -str2.charAt(0));
	        System.out.println(clonedName3);
	        
				
		       
		       
			}

		}
