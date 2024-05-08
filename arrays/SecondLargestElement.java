package arrays;

import java.util.Arrays;

public class SecondLargestElement {

	public static int secondLargestNumber(int[] arr) {
		Arrays.sort(arr); // here sorting the entire array will leads to time
							// compllexity
		return arr[arr.length - 2];
	}

	// another approach for reducing the time and space complexity

	public static void secondSmallest(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		System.out.println(Integer.MAX_VALUE);
		int secondSmallest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) { // traversing the array to find
												// // the smallest
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];

			} else if (arr[i] != smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println(
				String.format("second smallest number is %d ", secondSmallest));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{2, 3, 4, 56, 56, 6, 4, 3, 8, 89}; // len =10
																// ,index =9
		System.out.println(
				" second largest number is " + secondLargestNumber(arr));
		secondSmallest(arr);

	}

}
