package generics.fromCompleteRef.intro;

public class GenericDemo {

	public static void main(String[] args) {
		MyGenericClass<Integer> integerObject = new MyGenericClass<Integer>(99);
		integerObject.showTypeOf();
		int v = integerObject.getOb();
		System.out.println("value: " + v);

		MyGenericClass<String> stringObject = new MyGenericClass<String>(
				"Generic Test");
		stringObject.showTypeOf();
		String string = stringObject.getOb();
		System.out.println("value: " + string);

		MultiParameters<Integer, String> twoGen = new MultiParameters<Integer, String>(
				14, "Hey");
		System.out.println(twoGen.getOb());
		System.out.println(twoGen.getObV());
		twoGen.showTypeOf();

	}

}
