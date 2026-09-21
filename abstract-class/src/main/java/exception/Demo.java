package exception;

public class Demo {
	public static void main(String[] args) {
		try {
			throw new MyException("Bla");
		} catch (MyException e) {
			System.out.println(e);
		}
	}
}
