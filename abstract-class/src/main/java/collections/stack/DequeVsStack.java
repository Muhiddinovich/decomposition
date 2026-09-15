package collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DequeVsStack {

	public static void main(String[] args) {
//		Stack<String> stack = new Stack<>();
		Deque<String> stack = new ArrayDeque<>();

		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");

		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());

		System.out.println("Iteration: ");
		stack.stream().forEach((element) -> {
			System.out.println(element);
		});
	}

}
