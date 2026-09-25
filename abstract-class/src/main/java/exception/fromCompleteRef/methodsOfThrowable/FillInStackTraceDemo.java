package exception.fromCompleteRef.methodsOfThrowable;

public class FillInStackTraceDemo {

	public static void main(String[] args) {
		Exception exception = new Exception();
		exception.fillInStackTrace()
				.printStackTrace();;

	}

}
