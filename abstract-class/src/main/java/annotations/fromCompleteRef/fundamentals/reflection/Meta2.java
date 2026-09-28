package annotations.fromCompleteRef.fundamentals.reflection;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface What {
	String description();
}

@What(description = "Test class")
@MyAnno(string = "Meta2", val = 15)
public class Meta2 {

	@What(description = "Test method")
	@MyAnno(string = "Testing", val = 99)
	public static void myMethod() {
		System.out.println("All annotations of Meta2 class:");
		Meta2 meta2 = new Meta2();
		for (Annotation annotation : meta2.getClass()
				.getAnnotations()) {
			System.out.println(annotation);
		}

		try {
			System.out.println("All annotations of myMethod");
			for (Annotation annotation : meta2.getClass()
					.getMethod("myMethod")
					.getAnnotations()) {
				System.out.println(annotation);
			}
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println(e);
		}

	}
	public static void main(String[] args) {
		myMethod();
	}

}
