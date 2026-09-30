package annotations.fromCompleteRef.annotatedReceiver;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@interface TypeAnno {

}

public class SomeClass {
	public int myMethod(@TypeAnno SomeClass this) {
		return 0;
	}

	public static void main(String[] args) {
		try {
			System.out.println(new SomeClass().getClass()
					.getMethod("myMethod")
					.getAnnotatedReceiverType());
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
