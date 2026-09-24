package exception.fromCompleteRef;

public class Exercise2 {
	static void subroutine() {
		try {
			int d = 0;
			int a = 10 / d;
			System.out.println("This will not be printed!");
		} catch (ArithmeticException e) {
			// System.out.println("Division by zero!");
			System.out.println(e);
		}
		System.out.println("After catch statement");

	}
	public static void main(String[] args) {
		subroutine();
	}

}
