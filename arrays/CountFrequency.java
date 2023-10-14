package arrays;

import java.util.Arrays;

public class CountFrequency {

	public static void countFrequency(int[] arr, int n) {

		boolean[] visited = new boolean[n]; // to check the visited elements
		Arrays.fill(visited, false);

		for (int i = 0; i < n; i++) {

			if (visited[i] == true) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count += 1;
				}

			}
			System.out.println(
					"The value" + arr[i] + "occured  " + count + " times");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
		countFrequency(arr, arr.length);

	};

}
