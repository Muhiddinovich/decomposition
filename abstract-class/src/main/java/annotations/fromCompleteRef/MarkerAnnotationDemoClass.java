package annotations.fromCompleteRef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MarkerAnnotation {
}

public class MarkerAnnotationDemoClass {

	@MarkerAnnotation
	public static void myMethod() {
		try {
			if (new MarkerAnnotationDemoClass().getClass()
					.getMethod("myMethod")
					.isAnnotationPresent(MarkerAnnotation.class)) {
				System.out.println("MarkerAnnotation is present");
			}
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println(e);
		}

	}
	public static void main(String[] args) {
		myMethod();
	}

}
