package exception.fromCompleteRef;

public class SuperSubCatch {
	public static void main(String[] args) {

		try {
			int a = args.length;
			System.out.println("a= " + a);
			int b = 42 / a;
			int[] c = {1};
			c[42] = 99;
		} catch (Exception e) { // Due to this super class
			System.out.println(e);
		}
		// catch (ArithmeticException e) { // Unreachable code. ERROR!
		// System.out.println(e);
	}

}
