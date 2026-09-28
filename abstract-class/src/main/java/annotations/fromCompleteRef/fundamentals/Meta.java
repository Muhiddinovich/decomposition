package annotations.fromCompleteRef.fundamentals;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1 {
	int number();
	String str();
}
public class Meta {

	@MyAnno1(number = 14, str = "String element of annotation")
	public static void myMethod() {
		System.out.println("This is my method");
	}
	public static void main(String[] args) {
		try {
			System.out.println(new Meta().getClass()
					.getMethod("myMethod")
					.getAnnotation(MyAnno1.class)
					.str());
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println(e);
		}
	}

}
