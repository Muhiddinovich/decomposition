package exception.fromCompleteRef.methodsOfThrowable;

public class GetLocalizedMessageDemo {

	public static void main(String[] args) {
		Exception exception = new Exception("This is message") {

			@Override
			public String getLocalizedMessage() {
				return "Localized, huh: " + super.getLocalizedMessage();
			}
		};
		System.out.println(exception.getLocalizedMessage());

		System.out.println("This is getMessage(): " + exception.getMessage());
	}

}
