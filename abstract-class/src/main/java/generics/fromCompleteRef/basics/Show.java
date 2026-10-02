package generics.fromCompleteRef.basics;

public class Show {

	public static void main(String[] args) {
		DemoClass<Integer> class1 = new DemoClass<Integer>();
		class1.setA(7);
		System.out.println(class1.getA()
				.getClass());

	}

}
