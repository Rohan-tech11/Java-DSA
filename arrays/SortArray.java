package arrays;

public class SortArray {

	public static boolean isArraySorted(int[] arr, int length) {

		boolean status = false;
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] <= arr[i + 1]) { // i+1
				status = true;
			} else {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[]{1, 2, 3, 4, 5, 7};
		System.out.println(isArraySorted(arr, arr.length));

	}

}
