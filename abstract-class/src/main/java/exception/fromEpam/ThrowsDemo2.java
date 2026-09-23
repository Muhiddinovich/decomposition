package exception.fromEpam;

public class ThrowsDemo2 {

	public static void main(String[] args) {
		try {
			testExcp();
		} catch (Exception e) {
			System.out.println("Caught: " + e);
		}

	}

	static void testExcp() throws Exception {
		throw new Exception("test");
	}

}
