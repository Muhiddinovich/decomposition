package annotations.fromCompleteRef.annotatedReceiver;

public class Main {

	public static void main(String[] args) {
		SomeClass class1 = new SomeClass();
		System.out.println("There is no annotation on the object class1: ");
		System.out.println(class1.getClass()
				.isAnnotationPresent(TypeAnno.class));

		System.out.println(
				"However, when we call the method, <this> of the method is annotated with TypeAnno:");
		try {
			System.out.println(class1.getClass()
					.getMethod("myMethod")
					.getAnnotatedReceiverType());

		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
