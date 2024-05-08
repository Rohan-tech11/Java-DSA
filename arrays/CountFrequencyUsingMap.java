package arrays;

import java.util.HashMap;

public class CountFrequencyUsingMap {

	public static void CountFrequencyArrayUsingMap(int[] arr, int n) {

		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

		// map will not create the new entry if we put the same key again ,it
		// will simply update the value
		// because keys are unique

		for (int i = 0; i < n; i++) {
			if (freq.containsKey(arr[i])) {
				freq.put(arr[i], freq.get(arr[i]) + 1);
			} else {
				freq.put(arr[i], 1); // initial first step becasue map is empty
										// in first time

			}
		}
		System.out.println(freq);
		// for (Map.Entry entry : freq.entrySet()) {
		// System.out.println("the value " + entry.getKey() + "occured "
		// + entry.getValue() + " times");
		//
		// }

		freq.forEach((k, v) -> {
			System.out.println(
					String.format("the value  %d occured %d time", k, v));
		});

	}

	public static void main(String[] args) {// TODO Auto-generated method stub

		int arr[] = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
		CountFrequencyArrayUsingMap(arr, arr.length);
	}

}
