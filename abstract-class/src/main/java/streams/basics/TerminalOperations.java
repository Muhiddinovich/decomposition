package streams.basics;

import java.util.stream.Stream;

public class TerminalOperations {

	public static void main(String[] args) {
		// forEach(Consumer<T>)

		Stream<String> stream = Stream.of("Alice", "Bob", "Fred");
		stream.forEach(System.out::println);
	}

}
