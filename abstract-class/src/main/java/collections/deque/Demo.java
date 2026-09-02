package collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo {

	public static void main(String[] args) {
		Deque deque = new ArrayDeque<>();

		deque.offer(Integer.valueOf(178));
		deque.offer("Hello, Deque");

		Integer element = (Integer) deque.poll(); // Casting required
		String element1 = (String) deque.poll();// Casting required

		Deque<String> deque1 = new ArrayDeque<>();
		deque1.offer("He heeye");
		String obj = deque1.poll();
		System.out.println(obj);
	}

}
