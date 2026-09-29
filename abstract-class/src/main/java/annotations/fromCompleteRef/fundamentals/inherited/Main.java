package annotations.fromCompleteRef.fundamentals.inherited;

public class Main {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.getClass()
				.isAnnotationPresent(annoForClass.class));
	}

}
