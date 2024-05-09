package linkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList = new LinkedList(4);
		// myList.append(5);
		// myList.append(6);

		myList.printList();
		myList.getHeadValue();
		myList.getTailValue();
		myList.getLength();
		System.out.println("Removed Node  " + myList.removeLast().value);
		myList.getLength();
		myList.printList();

	}

}
