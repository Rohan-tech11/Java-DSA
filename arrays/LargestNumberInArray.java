package arrays;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class LargestNumberInArray {

	public static int findLargestArrayNumber(int[] arr) {

		/*
		 * // we are using an AtomicInteger to store the largest number. The //
		 * AtomicInteger class provides atomic operations for integer values, //
		 * allowing you to modify its value safely within the lambda expression.
		 */ AtomicInteger largestNumber = new AtomicInteger(arr[0]);

		Arrays.stream(arr).forEach(e -> {
			if (e > largestNumber.get()) {
				largestNumber.set(e);
			}

		}

		);

		// traditional approach
		/*
		 * for (int i = 0; i < arr.length; i++) { if (largestNumber <= arr[i]) {
		 * largestNumber = arr[i]; } }
		 */

		return largestNumber.get();
	}

	public static int bruteForceApproachofFindingLargeNumInArray(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5, 8, 10, 65};
		System.out.println(
				"Largest Number in array is " + findLargestArrayNumber(arr));

		System.out.println(bruteForceApproachofFindingLargeNumInArray(arr));

	}

}
