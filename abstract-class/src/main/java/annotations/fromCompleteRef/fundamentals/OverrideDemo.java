package annotations.fromCompleteRef.fundamentals;

public class OverrideDemo {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Deprecated(since = "my shift started")
	public static void method() {
		System.out.println("It still works but not recommended for future use");
	}
	public static void main(String[] args) {
		method();
		try {

			System.out.println(new OverrideDemo().getClass()
					.getMethod("method")
					.getAnnotation(Deprecated.class)
					.since());
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
