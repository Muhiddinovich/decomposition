package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ContainsDemo {

	public static void main(String[] args) {
		Queue<String> nameStrings=new LinkedList<>();
		nameStrings.offer("John");
		nameStrings.offer("Fred");
		System.out.println(nameStrings.contains("Fred"));
	}

}
