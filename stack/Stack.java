package stack;

public class Stack {

	private Node top;
	private int height;

	public Stack(int value) {
		Node newNode = new Node(value);
		top = newNode;
		height = 1;

	}

	class Node {
		Node next;
		int value;
		public Node(int value) {
			this.value = value;

		}

	}

	public void getTop() {
		System.out.println("the top node value is  : " + top.value);
	}
	public void printStack() {
		Node temp = top;
		while (temp != null) {
			System.out.println("the printed stack is  : " + temp.value);
			temp = temp.next;
		}

	}
	public void getHeight() {
		System.out.println("height of the stack is " + height);
	}

	public void push(int value) {
		Node newNode = new Node(value);

		if (height == 0) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}

		height++;
	}
	public Node pop() {
		if (height == 0) {
			return null;

		} else {

			Node temp = top;
			top = top.next;
			temp.next = null;
			height--;

			return temp;
		}
	}

}
