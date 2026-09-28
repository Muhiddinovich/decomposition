package annotations.fromCompleteRef.fundamentals.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
	String string();
	int val();
}
public class Demo {
	@MyAnno3(string = "this is string element of myAnno", val = 10)
	static void myMethod() {
		System.out.println("myMethod()");
	}
	public static void main(String[] args) {
		myMethod();
	}
}
