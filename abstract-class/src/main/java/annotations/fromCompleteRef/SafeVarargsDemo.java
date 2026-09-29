package annotations.fromCompleteRef;

public class SafeVarargsDemo {

	@SafeVarargs
	static <T> void printMethod(T... values) {
		for (T t : values) {
			System.out.println(t);
		}
	}

	public static void main(String[] args) {
		String[] words = {"Hi", "Hello", "Bye"};
		printMethod(words);

		Integer[] numbers = {1, 2, 6, 2, 45, 6, 783, 3};
		printMethod(numbers);
	}

}
