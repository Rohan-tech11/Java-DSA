package arrays;

public class MaximumConsecutive {

	public static int findMaxConsecutiveOnes(int[] nums) {

		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count += 1;
			} else {
				System.out
						.println("count :" + count + "max count :" + maxCount);
				maxCount = Math.max(maxCount, count);
				count = 0;
			}
		}
		maxCount = Math.max(maxCount, count); // checking again if the code
												// didnt get into the else block
		return maxCount;
	}

	public static void main(String[] args) {

		int[] arr = new int[]{1, 1, 0, 1, 1, 1};
		System.out.println(findMaxConsecutiveOnes(arr));

	}

}
