package exception.fromEpam;

public class ThrowsDemo {

	static double squareRootOf(double value) throws Exception {
		if (value < 0) {
			throw new IllegalArgumentException("It cannot be negative number");
		}
		return Math.sqrt(value);
	}
	public static void main(String[] args) {
		try {
			System.out.println(squareRootOf(-10));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
