package arrays;

import java.util.Arrays;

public class LeftRotateArray {

	public static int[] rotateLeftArray(int[] arr, int length) {
		int temp = arr[0];
		for (int i = 0; i < length - 1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[length - 1] = temp;

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[]{6, 7, 8, 9, 10};
		int[] newArr = rotateLeftArray(arr, arr.length);
		System.out.println(Arrays.toString(newArr));

		int i = 98;
		int j = 65;
		System.out.println(i % 10);

	}

}
