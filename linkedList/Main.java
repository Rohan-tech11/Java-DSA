package linkedList;

public class Main {

	public static void main(String[] args) {
		/*
		 * --------------------------------------------------------------------
		 */
		// testing the append and removelast()
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
		System.out.println(" newly prepended list is ");
		myLinkedList1.printList();

		// --------------------------------------------------------------------
		// testing the remove first
		System.out.println(" testing the removeFirst method ");

		LinkedList myLinkedList2 = new LinkedList(2);
		myLinkedList2.append(1);

		// (2) Items - Returns 2 Node
		System.out.println(myLinkedList2.removeFirst().value);
		// (1) Item - Returns 1 Node
		System.out.println(myLinkedList2.removeFirst().value);
		// (0) Items - Returns null
		System.out.println(myLinkedList2.removeFirst());

		// --------------------------------------------------------------------
		// testing the get ()
		System.out.println(" testing the get method ");

		LinkedList myLinkedList3 = new LinkedList(0);
		myLinkedList3.append(1);
		myLinkedList3.append(2);
		myLinkedList3.append(3);

		System.out.println(myLinkedList3.get(2).value);

		// --------------------------------------------------------------------
		// testing the set ()
		System.out.println("  testing the set method ");

		LinkedList myLinkedList4 = new LinkedList(0);
		myLinkedList4.append(1);
		myLinkedList4.append(2);
		myLinkedList4.append(3);
		myLinkedList4.printList();

		System.out.println(myLinkedList4.set(2, 3));
		myLinkedList4.printList();

		// --------------------------------------------------------------------
		// testing the insert ()
		System.out.println("  testing the insert method ");

		LinkedList myLinkedList5 = new LinkedList(1);
		myLinkedList5.append(3);

		System.out.println("LL before insert():");
		myLinkedList5.printList();

		myLinkedList5.insert(1, 2);

		System.out.println("\nLL after insert(2) in middle:");
		myLinkedList5.printList();
		myLinkedList5.getLength();

		myLinkedList5.insert(0, 0);

		System.out.println("\nLL after insert(0) at beginning:");
		myLinkedList5.printList();
		myLinkedList5.getLength();

		myLinkedList5.insert(4, 4);

		System.out.println("\nLL after insert(4) at end:");
		myLinkedList5.printList();
		myLinkedList5.getLength();

		// --------------------------------------------------------------------
		// testing the remove ()
		System.out.println("  testing the remove method ");

		LinkedList myLinkedList6 = new LinkedList(1);
		myLinkedList6.append(2);
		myLinkedList6.append(3);
		myLinkedList6.append(4);
		myLinkedList6.append(5);

		System.out.println("LL before remove():");
		myLinkedList6.printList();

		System.out.println("\nRemoved node:");
		System.out.println(myLinkedList6.remove(2).value);
		System.out.println("LL after remove() in middle:");
		myLinkedList6.printList();

		System.out.println("\nRemoved node:");
		System.out.println(myLinkedList6.remove(0).value);
		System.out.println("LL after remove() of first node:");
		myLinkedList6.printList();

		System.out.println("\nRemoved node:");
		System.out.println(myLinkedList6.remove(2).value);
		System.out.println("LL after remove() of last node:");
		myLinkedList6.printList();

	}

}
