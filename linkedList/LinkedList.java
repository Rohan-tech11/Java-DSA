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
		// so we can point out the tail to the pre node
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
