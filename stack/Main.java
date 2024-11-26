package stack;

public class Main {
	public static void main(String[] args) {
		Stack myStack = new Stack(1);
		myStack.push(2);
		myStack.getTop();
		myStack.printStack();
		myStack.getHeight();

		myStack.pop();
		myStack.getHeight();

		myStack.printStack();

	}

}
