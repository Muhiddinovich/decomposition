package streams.basics;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {

	public static void main(String[] args) {
		// Intermediate operations are lazy, they return a stream and they are not
		// executed unless a terminal operation is called

		// filter(Predicate<T>)
		Stream<Integer> stream = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();
		stream.filter(n -> n % 2 == 0)
//			.forEach(System.out::println);
				.collect(Collectors.toList());

		// map(Function<T, R>)

		Stream<String> stream2 = List.of("Fred", "Alice", "Bob").stream();
		System.out.println("length of each string: ");
		stream2.map(String::length).forEach(System.out::println);

		// sorted(Comparator<T>)

		Stream<Integer> stream3 = List.of(5, 5, 23, 7, 2, 4, 8, 45).stream();
		System.out.println("Sorted list of integers");
		stream3.sorted().forEach((n) -> System.out.println(n));
//		stream3.sorted(Comparator.reverseOrder()).forEach((n) -> System.out.println(n)); //stream has already been operated upon or closed

		Stream<Integer> stream4 = List.of(34, 12, 435, 56, 34, 56, 2, 3, 3, 3, 46, 0).stream();
		stream4.filter(n -> n % 2 == 0).peek(n -> System.out.println("After filtering only even numbers: " + n))
				.map(n -> n * 2).peek(n -> System.out.println("After doubling numbers: " + n))
				.forEach(System.out::println);
	}

}
