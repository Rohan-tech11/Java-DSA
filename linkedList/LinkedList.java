package linkedList;

public class LinkedList {

	private Node head;
	private Node tail;

	private int length;

	public LinkedList(int value) {
		Node newNode = new Node(value);
		// since it is the first node both tail and head points to the same node
		head = newNode;
		tail = newNode;
		length = 1;

	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode; // pointing current node reference to the new
									// node
			tail = newNode; // point tail node to the newly created node
		}
		length++;
	}

	public Node removeLast() {
		Node temp = head;
		Node pre = head;
		if (length == 0) {
			return null;
		}
		// pre node points out the node before null
		// so we can point out the tail to the pre before node
		// temp node is the node to be removed from the list
		// traversing the list to move temp node to last of the list
		while (temp.next != null) {
			pre = temp;
			temp = temp.next; // pointing temp to the next node

		}
		tail = pre;
		tail.next = null;
		length--;
		// edge case if the list is having one element
		// so its length became 1 to zero ,so I've assigned head,tail to null
		if (length == 0) {
			head = null;
			tail = null;
		}
		return temp;

	}

	// adding node in the first
	public void prepend(int value) {
		Node newNode = new Node(value);

		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length += 1;
	}

	// removing node in the first
	public Node removeFirst() {
		Node temp = head;
		if (length == 0) {
			return null;
		}

		head = head.next;
		temp.next = null;
		length -= 1;
		// edge case to checking if list is having only one element
		if (length == 0) {
			tail = null;
		}
		return temp;

	}

	// getMethod

	public Node get(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// set method //leveraging get method the get the node which needs to be
	// updated
	public boolean set(int index, int value) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = value;
			return true;
		}

		return false;

	}

	// insert method ,leveraging get,append,prepend method to insert new node
	public boolean insert(int index, int value) {
		if (index < 0 || index > length) {
			return false;
		} else if (index == 0) {
			prepend(value);
			return true;
		} else if (index == length) {
			append(value);
			return true;
		}

		else {
			Node newNode = new Node(value);
			Node temp = get(index - 1);
			newNode.next = temp.next;
			temp.next = newNode;
			length++;
			return true;

		}
	}

	// remove method leveraging get,remove first and last method
	public Node remove(int index) {

		if (index < 0 || index >= length) {
			return null;
		}
		if (index == 0) {
			return removeFirst();
		}
		if (index == length - 1) {
			return removeLast();
		}
		Node temp = get(index);
		Node pre = get(index - 1);
		pre.next = temp.next;
		temp.next = null;
		length--;
		return temp;

	}

	// reverse method
	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;
		for (int i = 0; i < length; i++) {

			after = temp.next; // pointing after node variable to the next temp
								// node
			temp.next = before; // pointing next temp node to before(reversing
								// the arrow)
			before = temp;// moving the before to temp
			temp = after;// moving the temp to after
		}
	}
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}

	}
	public void getHeadValue() {
		System.out.println("Head :" + head.value);
	}
	public void getTailValue() {
		System.out.println("tail :" + tail.value);
	}
	public void getLength() {
		System.out.println("length :" + length);

	}

}
