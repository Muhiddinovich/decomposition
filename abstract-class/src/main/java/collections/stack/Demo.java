package collections.stack;

import java.util.Iterator;
import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("one");
		stack.add("two");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		stack.add("one");
		stack.add("two");
		stack.add("three");
		System.out.println(stack);
		int search = stack.search("one");
		System.out.println(search);
		System.out.println(stack.search("two"));
		stack.add("four");
		System.out.println(stack.search("two"));
		System.out.println(stack.search("five"));

		// Iteration: Iterator/forEach/stream

		System.out.println();
		//Iterator
		System.out.println("Iterator: \n");
		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println("Iterator: " + string);
		}
		
		System.out.println();
		//forEach
		System.out.println("forEach\n");
		for (String string : stack) {
			System.out.println("forEach: "+string);
		}
		System.out.println();
		//Streams
		System.out.println("Streams: \n");
		stack.stream().forEach(element->System.out.println("stream: "+element));
	}
}
