package com.linkedlist.leetcode2;

public class LinkedList {

	private Node head;
	private Node tail;
	private int length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public int getLength() {
		return length;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printAll() {
		if (length == 0) {
			System.out.println("Head: null");
			System.out.println("Tail: null");
		} else {
			System.out.println("Head: " + head.value);
			System.out.println("Tail: " + tail.value);
		}
		System.out.println("Length:" + length);
		System.out.println("\nLinked List:");
		if (length == 0) {
			System.out.println("empty");
		} else {
			printList();
		}
	}

	public void makeEmpty() {
		head = null;
		tail = null;
		length = 0;
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public boolean hasLoop() {
		// Initialize slow pointer to the head of the linked list
		Node slow = head;

		// Initialize fast pointer to the head of the linked list
		Node fast = head;

		// Traverse the linked list with two pointers: slow and fast
		// slow moves one node at a time, while fast moves two nodes at a time
		while (fast != null && fast.next != null) {
			// Move slow pointer to the next node
			slow = slow.next;

			// Move fast pointer to the next two nodes
			fast = fast.next.next;

			// If slow pointer meets fast pointer, then there is a loop in the
			// linked list
			if (slow == fast) {
				return true;
			}
		}

		// If the loop has not been detected after the traversal, then there is
		// no loop in the linked list
		return false;
	}

}
