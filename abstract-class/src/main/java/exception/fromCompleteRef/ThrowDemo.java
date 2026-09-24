package exception.fromCompleteRef;

public class ThrowDemo {

	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("Caught exception in method: " + e.getMessage());
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("Recaught exception in main: " + e.getMessage());
		}
	}

}
