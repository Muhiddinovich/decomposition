package queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<Customer> queue = new LinkedList<>();
		queue.add(new Customer("Anna"));
		queue.add(new Customer("Nick"));

		Customer anna = queue.poll();
		Customer nick = queue.poll();

		System.out.println(anna.getName());
		System.out.println(nick.getName());

		Queue<Customer> queue1 = new LinkedList<>();
		Queue<Customer> queue2 = new ArrayDeque<>();
		Queue<Customer> queue3 = new PriorityQueue<>();

		Queue<Customer> sampleQueue = new LinkedList<>(); // with generic type specified
		sampleQueue.add(new Customer("Fred"));
//		sampleQueue.add("Fred");

		Queue sampleQueue2 = new LinkedList<>();
		sampleQueue2.add("Fred");
		sampleQueue2.add(200);

		String word = (String) sampleQueue2.poll(); // there has to be casting 
		int number =  (Integer) sampleQueue2.poll();
		
		

	}

}
