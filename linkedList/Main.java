package linkedList;

public class Main {

	public static void main(String[] args) {
		// --------------------------------------------------------------------

		// testing the append and removelast
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		// (2) Items - Returns 2 Node
		System.out.println(myLinkedList.removeLast().value);
		// (1) Item - Returns 1 Node
		System.out.println(myLinkedList.removeLast().value);
		// (0) Items - Returns null
		System.out.println(myLinkedList.removeLast());
		myLinkedList.getLength();
		myLinkedList.printList();

		// --------------------------------------------------------------------

		// testing the prepend
		LinkedList myLinkedList1 = new LinkedList(2);
		myLinkedList1.prepend(1);
		System.out.println(" newly prepended list  is  ");
		myLinkedList1.printList();

		// --------------------------------------------------------------------
		// testing the remove first
		System.out.println("  testing the removeFirst method ");

		LinkedList myLinkedList2 = new LinkedList(2);
		myLinkedList2.append(1);

		// (2) Items - Returns 2 Node
		System.out.println(myLinkedList2.removeFirst().value);
		// (1) Item - Returns 1 Node
		System.out.println(myLinkedList2.removeFirst().value);
		// (0) Items - Returns null
		System.out.println(myLinkedList2.removeFirst());

	}

}
