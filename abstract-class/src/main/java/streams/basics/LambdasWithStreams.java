package streams.basics;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdasWithStreams {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Alice", "Bob", "Fred", "Fred", "Farid", "Frank");
		Set<String> set = stream.filter(name -> name.startsWith("F")).map(name -> name.toUpperCase())
				.peek(name -> System.out.println("Upper: " + name)).collect(Collectors.toSet());

		System.out.println("Final Set: " + set);

		List<String> names = List.of("Alice", "Bob", "Andrew", "Fred", "Anna", "Mike", "Alex");

		Stream<String> stream2 = names.stream();

		List<String> result = stream2.filter(name -> name.startsWith("A")).map(String::toUpperCase)
				.peek(System.out::println).collect(Collectors.toList());
		
		System.out.println(result);

	}

}
