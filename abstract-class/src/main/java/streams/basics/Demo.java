package streams.basics;

import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		Stream<Double> stream = Stream.generate(Math::random).limit(5);
		stream.forEach(element -> System.out.println(element));

		Stream<Integer> stream2 = Stream.iterate(0, n -> n + 1).limit(10);
		stream2.forEach(element -> System.out.println(element));

		Stream<Integer> stream3 = Stream.generate(() -> (int) (Math.random() * 101)).limit(10);

		stream3.forEach(System.out::println);

	}

}
