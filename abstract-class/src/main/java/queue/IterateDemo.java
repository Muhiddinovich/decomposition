package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class IterateDemo {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("John");
		queue.offer("Fred");
		queue.offer("Bred");

		Iterator<String> iterator = queue.iterator(); // Iterator

		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

		for (String element : queue) {
			System.out.println(element);
		}

		queue.stream().forEach((nextElement) -> {
			System.out.println(nextElement);
		});
	}

}
