package collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.offerFirst("Fred");
		deque.offer("Carrey");
		deque.offerFirst("Head");
		deque.offerLast("Tail");

		System.out.println(deque);

		// queue mode FIFO
		Deque<String> deque1 = new ArrayDeque<>();
		deque1.offerLast("First");
		deque1.offerLast("Second");
		deque1.offerLast("Third");
		deque1.offerLast("Fourth");
		deque1.offer("Fifth");

		System.out.println(deque1);
		// stack more LIFO
		Deque<String> stack = new ArrayDeque<>();
		stack.offerFirst("A");
		stack.offerFirst("B");
		stack.offerFirst("C");
		stack.offerFirst("D");
		System.out.println(stack);
		
		System.out.println(stack.pollFirst());
		System.out.println(stack.pollFirst());
		System.out.println(stack.pollFirst());
		System.out.println(stack.pollFirst());
		
		
	}
}
