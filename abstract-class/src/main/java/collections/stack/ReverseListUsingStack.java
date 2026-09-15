package collections.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseListUsingStack {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		System.out.println("Before: " + list);

		Stack<String> stack = new Stack<>();

		while (list.size() > 0) {
			stack.add(list.remove(0));
		}

		while (stack.size() > 0) {
			list.add(stack.pop());
		}

		System.out.println("After: " + list);
	}

}
