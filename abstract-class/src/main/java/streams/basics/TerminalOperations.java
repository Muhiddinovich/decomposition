package streams.basics;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {

	public static void main(String[] args) {
		// forEach(Consumer<T>)

		Stream<String> stream = Stream.of("Alice", "Bob", "Fred", "Fred");
		stream.forEach(System.out::println);

//		collect(Collector)

		Stream<String> stream1 = Stream.of("Alice", "Bob", "Fred", "Fred");
		Set<String> set = new HashSet<>();
		set = stream1.collect(Collectors.toSet());
		System.out.println("Set:" + set);

//		count()

		Stream<String> stream2 = Stream.of("Alice", "Bob", "Fred", "Fred");
		System.out.println("count(): " + stream2.count());

//		anyMatch(Predicate<T>), allMatch(Predicate<T>), noneMatch(Predicate<T>)
		Stream<String> stream3 = Stream.of("Alice", "Bob", "Fred", "Fred");

//		System.out.println("Anymatch(): " + stream3.anyMatch(n -> n.equals("Fred")));  //true
//		System.out.println("allMatch(): " + stream3.allMatch(n -> n.equals("Fred"))); //false
		System.out.println("noneMatch(): " + stream3.noneMatch(n -> n.equals("Fred1"))); // true

//		findFirst() and findAny()
		Stream<String> stream4 = Stream.of("Alice", "Bob", "Fred", "Fred");
		System.out.println("Find any: "+stream4.findAny());
//		System.out.println("findFirst():" + stream4.findFirst());
	}

}
