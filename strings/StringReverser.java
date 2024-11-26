package strings;
public class StringReverser {
	public static void main(String[] args) {
		// Test string
		String input = "Hello World";

		System.out.println("Original String: " + input);
		System.out.println(
				"Using Character Array: " + reverseWithCharArray(input));
		System.out.println(
				"Using StringBuilder: " + reverseWithStringBuilder(input));
		System.out.println("Using Recursion: " + reverseWithRecursion(input));

		// Testing edge cases
		System.out.println("\nTesting Edge Cases:");
		System.out.println("Empty string: " + reverseWithCharArray(""));
		System.out.println("Single character: " + reverseWithCharArray("A"));
		System.out.println("Null string: " + reverseWithCharArray(null));
	}

	// Method 1: Using Character Array
	// Time Complexity: O(n), Space Complexity: O(n)
	public static String reverseWithCharArray(String str) {
		// First check for null and empty string
		if (str == null || str.isEmpty()) {
			return str;
		}

		// Convert string to character array
		char[] charArray = str.toCharArray();

		// Use two pointers technique: one from start and one from end
		int left = 0;
		int right = charArray.length - 1;

		// Swap characters from start and end until pointers meet in middle
		while (left < right) {
			// Store the character at left pointer temporarily
			char temp = charArray[left];
			// Replace left character with right character
			charArray[left] = charArray[right];
			// Replace right character with temporary stored character
			charArray[right] = temp;

			// Move pointers towards center
			left++;
			right--;
		}

		// Convert char array back to string and return
		return new String(charArray);
	}

	// Method 2: Using StringBuilder
	// Time Complexity: O(n), Space Complexity: O(n)
	public static String reverseWithStringBuilder(String str) {
		// Check for null and empty string
		if (str == null || str.isEmpty()) {
			return str;
		}

		// Create StringBuilder with input string
		StringBuilder sb = new StringBuilder(str);

		// Use built-in reverse() method and convert back to string
		return sb.reverse().toString();
	}

	// Method 3: Using Recursion
	// Time Complexity: O(n), Space Complexity: O(n) due to recursive call stack
	public static String reverseWithRecursion(String str) {
		// Base cases
		if (str == null || str.length() <= 1) {
			return str;
		}

		// Recursive case:
		// Take first character and put it at the end of reversed substring
		// charAt(0) gets first character
		// substring(1) gets everything except first character
		return reverseWithRecursion(str.substring(1)) + str.charAt(0);
	}

}