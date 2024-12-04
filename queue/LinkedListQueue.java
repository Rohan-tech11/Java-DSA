package queue;
import java.util.LinkedList;

public class LinkedListQueue<T> {
	private LinkedList<T> myList = new LinkedList<>(); // Using generic T

	// Add element to end of queue
	public void enqueue(T value) {
		myList.addLast(value); // addLast() makes the queue behavior clearer
	}

	// Remove and return element from front of queue
	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return myList.removeFirst();
	}

	// Check if queue is empty
	public boolean isEmpty() {
		return myList.isEmpty();
	}

	// View front element without removing
	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return myList.getFirst();
	}

	// Get size of queue
	public int size() {
		return myList.size();
	}

	public static void main(String[] args) {
		// Example usage
		LinkedListQueue<Integer> queue = new LinkedListQueue<>();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		System.out.println("Front element: " + queue.peek()); // prints 1
		System.out.println("Removed: " + queue.dequeue()); // removes and prints
															// 1
		System.out.println("New front: " + queue.peek()); // prints 2
	}
}