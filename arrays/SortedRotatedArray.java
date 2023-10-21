package arrays;
/*  given an array nums,return true if 
the array was originally sorted in non-decreasing order,
then rotated some number of positions(including zero).Otherwise,return false.*/

public class SortedRotatedArray {

	public static boolean check(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				count += 1;
			}

		}
		if (count == 0) {
			return true;
		} else if (count > 1) {
			System.out.println("ho");
			return false;
		} else if (arr[0] >= arr[arr.length - 1]) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[]{3, 4, 5, 1, 2};
		System.out.println(check(arr));
	}

}
