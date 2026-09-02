package queue;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveDemo {

	public static void main(String[] args) {
		Queue<Customer> queue = new LinkedList<>();
		queue.add(new Customer("Anna"));
		queue.add(new Customer("Nick"));
		
		System.out.println(queue.remove().getName());
		System.out.println(queue.isEmpty());
		System.out.println(queue.offer(new Customer(null)));
		System.out.println(queue.peek().getName());
		System.out.println(queue.size());
		queue.clear();
		System.out.println(queue.size());
	}

}
