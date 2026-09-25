package exception.fromCompleteRef.methodsOfThrowable;

public class GetSuppressedDemo {

	public static void main(String[] args) {
		Exception mainException = new Exception();
		Exception extraException = new Exception(
				"This is suppressed exception");

		mainException.addSuppressed(extraException);
		for (Throwable element : mainException.getSuppressed()) {
			System.out.println(element.getMessage());
		}
	}

}
