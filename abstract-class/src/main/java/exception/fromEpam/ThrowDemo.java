package exception.fromEpam;

public class ThrowDemo {

	static void testG() {
		try {
			throw new ClassCastException("Demo");
		} catch (ClassCastException e) {
			System.out.println("Exception in method");
			throw e;
		}
	}
	

	public static void main(String[] args) {
		try {
			testG();
		} catch (Exception e) {
			System.out.println("Exception caught in main: " + e);
		}
	}

}
