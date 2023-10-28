package arrays;

import java.util.Arrays;

public class RotateZeros {

	public static int[] zerosLast(int[] arr) {

		int j = -1;

		// j represents the first zeroth element in the array

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				j = i;
				break;

			}
		}

		// if there is no zeros return the array
		if (j == -1) {
			return arr;
		}

		// loop to swap non-zero elemens
		for (int i = j + 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = new int[]{1, 2, 3, 0, 0, 4, 6, 0, 1};
		System.out.println(Arrays.toString(zerosLast(arr)));

	}

}
