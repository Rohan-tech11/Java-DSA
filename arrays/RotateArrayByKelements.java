package arrays;

import java.util.Arrays;

public class RotateArrayByKelements {

	public static void Reverse(int[] arr, int start, int end) {
		while (start <= end) { // When start becomes greater than end, it means
								// that the two indices have crossed each other
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start += 1;
			end -= 1;
		}
		// System.out.println(Arrays.toString(arr));
	}

	// Function to Rotate k elements to right
	public static void Rotateeletoright(int[] arr, int lenght, int position) {
		// Reverse first n-k elements
		Reverse(arr, 0, lenght - position - 1); // 6,5,4,3,2,1,7,8
		// Reverse last k elements
		// Reverse whole array
		Reverse(arr, 0, lenght - 1); // 7,8,1,2,3,4,5,6

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		// rotateArray(arr, 3);
		Rotateeletoright(arr, arr.length, 2);

	}

}
