package generics.fromCompleteRef.genericInterface;

public class GenericInterfaceDemo {

	public static void main(String[] args) {
		Integer[] inums = {4, 6, 3, 1, 7, 2, 7, 43534};
		Character[] chs = {'b', 'r', 'p', 'w', 'q', 'a', 'c'};

		MyClass<Integer> iob = new MyClass<>(inums);
		MyClass<Character> cob = new MyClass<>(chs);
		System.out.println("Max value in inums: " + iob.max());
		System.out.println("Min value in inums: " + iob.min());

		System.out.println("Max value in chs: " + cob.max());
		System.out.println("Min value in chs: " + cob.min());

	}

}
