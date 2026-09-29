package annotations.fromCompleteRef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface mySinglMemberAnnotation {
	int value(); // we must use "value" as element name in order to turn on the
					// shorthand
	int value1() default 100;
}

public class SingleMemberAnnotationDemoClass {

	@mySinglMemberAnnotation(99) // <- shorthand
	public static void myMethod() {
		try {
			mySinglMemberAnnotation annotation = new SingleMemberAnnotationDemoClass()
					.getClass()
					.getMethod("myMethod")
					.getAnnotation(mySinglMemberAnnotation.class);
			System.out.println(annotation.value() + " " + annotation.value1());
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println(e);
		}

	}
	public static void main(String[] args) {
		myMethod();
	}

}
