package annotations.fromCompleteRef;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // @Target
//
//
//
//
//

@Documented // @Documented
@Retention(RetentionPolicy.RUNTIME) // @Retention
@interface myAnnotation {
}

@Target(ElementType.LOCAL_VARIABLE)
@interface annoForLocalVariables {
}

@Target(ElementType.PARAMETER)
@interface ParameterAnno {

}
public class BuiltInAnnotations {

	@myAnnotation
	public static void myMethod(@ParameterAnno int number) {
		@annoForLocalVariables
		int age = number;
		System.out.println("myMethod(): " + age);
	}
	public static void main(String[] args) {
		myMethod(20);
	}

}
