package exception.fromCompleteRef.methodsOfThrowable;

public class ToStringDemo {

	public static void main(String[] args) {
		try {
			throw new IllegalArgumentException();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
