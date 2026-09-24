package exception.fromCompleteRef;

public class ThowsDemo {

	static void throwOne() throws IllegalAccessException {
		System.out.println("Throwing exception Inside the method ");
		throw new IllegalAccessException("demo");
	}
	public static void main(String[] args) {
		try {
			System.out.println("in main");
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("ReCaught in main");
		}
	}

}
