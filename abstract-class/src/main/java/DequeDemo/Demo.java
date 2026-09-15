package DequeDemo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
//			Stack mode
		Deque<String> stack = new ArrayDeque<>();
		stack.offerFirst("Dasd");
		stack.offerFirst("Bingo");
		stack.offerFirst("Hey");

		System.out.println(stack);
		System.out.println(stack.poll());
		System.out.println(stack.poll());
		System.out.println(stack.poll());

//			Queue mode

		Deque<String> queue = new LinkedList<>();
		queue.add("Hey");
		queue.add("Blabla");
		queue.add("Bingo");
		System.out.println(queue);
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());

		System.out.println("--------------------Iterator");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		System.out.println("-----------------------foreach");
		for (String string : queue) {
			System.out.println(string);
		}
		
		System.out.println("--------------------------Stream");
		Stream<String> stream = queue.stream();
		stream.forEach(element->System.out.println(element));
	}
}
