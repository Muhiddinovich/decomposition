package exception.fromEpam;

public class ThrowDemo2 {

	static double squareRootOf(double value) {
		if (value < 0) {
			throw new IllegalArgumentException("It cannot be negative number");
		}
		return Math.sqrt(value);
	}
	public static void main(String[] args) {
		try {
			squareRootOf(-10);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
