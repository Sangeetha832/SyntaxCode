package Java_Basics_Conditions;

public class Find_High_of_three {
	public static void main(String[] args) {
		int[] arr = {12, 3, 82, 34, 78, 99 };
		int n  =arr.length;
		int largest = -1;
		for(int i = 0; i<n;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println("the highest value is "+largest);
	}
}
