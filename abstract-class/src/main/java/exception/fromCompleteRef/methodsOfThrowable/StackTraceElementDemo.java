package exception.fromCompleteRef.methodsOfThrowable;

import java.util.stream.Stream;

public class StackTraceElementDemo {

	static void testMethod() {
		throw new IllegalArgumentException();
	}

	static void testMethod2() {
		testMethod();
	}

	static void testMethod3() {
		testMethod2();
	}
	public static void main(String[] args) {

		try {
			testMethod3();
		} catch (Exception e) {
			StackTraceElement[] stack = e.getStackTrace();
			Stream<StackTraceElement> stream = Stream.of(stack);
			stream.forEach(element -> System.out.println(element));
		}
	}

}
