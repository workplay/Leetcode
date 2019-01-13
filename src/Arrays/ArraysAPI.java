package Arrays;

import java.util.Arrays;

public class ArraysAPI {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 2, 4};
		int b[] = { 1, 3, 5, 2, 4};
	
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int index = Arrays.binarySearch(a, 3);
		System.out.println(index);
		
		int index2 = Arrays.binarySearch(b, 3);
		System.out.println(index2);
		
		boolean equal = Arrays.equals(a, b);
		System.out.println(equal);
		
	}

}
