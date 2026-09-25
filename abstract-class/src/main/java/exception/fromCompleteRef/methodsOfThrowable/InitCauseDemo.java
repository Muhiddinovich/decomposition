package exception.fromCompleteRef.methodsOfThrowable;

public class InitCauseDemo {

	public static void main(String[] args) {
		Exception main = new Exception("File not found");
		Exception cause = new Exception("Could not load the program");

		main.initCause(cause);

		main.printStackTrace();
		

	}

}
