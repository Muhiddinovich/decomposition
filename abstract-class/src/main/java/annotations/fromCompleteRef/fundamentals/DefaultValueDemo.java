package annotations.fromCompleteRef.fundamentals;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface annotation1 {
	String str() default "Default description";
	int age() default 18;
}
public class DefaultValueDemo {

	@annotation1(age = 20, str = "String element")
	public static void myMethod() {
		System.out.println("My method");
	};
	public static void main(String[] args) {

		System.out.println("Default values of the annotation:");
		try {
			System.out.println(new DefaultValueDemo().getClass()
					.getMethod("myMethod")
					.getAnnotation(annotation1.class));;
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println(e);
		}
	}

}
