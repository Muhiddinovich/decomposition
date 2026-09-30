package annotations.fromCompleteRef.repeatableAnnotations;

import java.lang.annotation.Annotation;
import java.util.Iterator;

public class Demo {

	@MyRepeatedAnno
	@MyRepeatedAnno(string = "fred", val = 24)
	@MyRepeatedAnno(string = "Bred", val = 543)
	public static void myMethod(String name, int age) {
		System.out.println("myMethod(): " + name + " " + age);
	}
	public static void main(String[] args) {
		try {
			MyRepeatedAnnoContainer annotation = new Demo().getClass()
					.getMethod("myMethod", String.class, int.class)
					.getAnnotation(MyRepeatedAnnoContainer.class);
			for (Annotation annotation1 : annotation.value()) {
				System.out.println(annotation1);
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("-------------------");
		System.out.println();

		try {
			Annotation[] annotations = new Demo().getClass()
					.getMethod("myMethod", String.class, int.class)
					.getAnnotationsByType(MyRepeatedAnno.class);
			for (Annotation e : annotations) {
				System.out.println(e);
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
