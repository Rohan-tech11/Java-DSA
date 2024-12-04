package stack;

import java.util.ArrayList;

public class StackPopAL<T> {

	private ArrayList<T> stackList = new ArrayList<>();

	public ArrayList<T> getStackList() {
		return stackList;
	}

	public void printStack() {
		for (int i = stackList.size() - 1; i >= 0; i--) {
			System.out.println(stackList.get(i));
		}
	}

	public boolean isEmpty() {
		return stackList.size() == 0;
	}

	public T peek() {
		if (isEmpty()) {
			return null;
		} else {
			return stackList.get(stackList.size() - 1);
		}
	}

	public int size() {
		return stackList.size();
	}

	public void push(T value) {
		stackList.add(value);
	}

	// WRITE POP METHOD HERE //
	// //
	// //
	// //
	///////////////////////////

	// Removes and returns the top element from the stack
	public T pop() {
		// Check if the stack is empty, if so return null
		if (isEmpty())
			return null;
		// Removes the element from the end of the list
		// (which is the top of the stack) and returns it
		return stackList.remove(stackList.size() - 1);
	}
}
