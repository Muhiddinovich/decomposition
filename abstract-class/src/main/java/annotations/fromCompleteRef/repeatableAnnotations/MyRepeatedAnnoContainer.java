package annotations.fromCompleteRef.repeatableAnnotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface MyRepeatedAnnoContainer {
	MyRepeatedAnno[] value();
}
