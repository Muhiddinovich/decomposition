package annotations.fromCompleteRef.fundamentals.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String string();
	int val();
}
public class Demo2 {
	@MyAnno(string = "this is string element of myAnno", val = 10)
	public static void myMethod(String name, int age) {
		System.out.println("myMethod()");
	}
	public static void main(String[] args) {
		try {
			System.out.println(new Demo2().getClass()
					.getMethod("myMethod", String.class, int.class)
					.getAnnotation(MyAnno.class)
					.string());
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println(e);
		}
		System.out.println();
	}
}
