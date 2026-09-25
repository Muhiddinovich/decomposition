package exception.fromCompleteRef.methodsOfThrowable;

public class AddSuppressedDemo {

	public static void main(String[] args) {
		Exception mainException = new Exception();
		Exception extraException = new Exception();

		mainException.addSuppressed(extraException);
		mainException.printStackTrace();
	}

}
