package annotations.fromCompleteRef.fundamentals.inherited;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface annoForClass {

}

@annoForClass
public class Parent {

}
