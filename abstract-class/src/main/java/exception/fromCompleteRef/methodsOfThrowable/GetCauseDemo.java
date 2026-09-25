package exception.fromCompleteRef.methodsOfThrowable;

public class GetCauseDemo {

	public static void main(String[] args) {
		Exception a = new Exception("File not found");
		Exception b = new Exception("Could not start program", a);
		
		System.out.println(b.getCause());
	}

}
