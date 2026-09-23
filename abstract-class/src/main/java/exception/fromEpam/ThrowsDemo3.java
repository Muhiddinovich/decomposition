package exception.fromEpam;

public class ThrowsDemo3 {

	public static void main(String[] args) {
		try {
			testExcp();
		} catch (RuntimeException e) {
			System.out.println("Caught: " + e);
		}
	}

	static void testExcp() {
		throw new RuntimeException();
	}
}
