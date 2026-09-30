package annotations.fromCompleteRef.repeatableAnnotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

@Retention(RUNTIME)
@Repeatable(MyRepeatedAnnoContainer.class)
public @interface MyRepeatedAnno {
	String string() default "Default Testing";
	int val() default 9000;
}
