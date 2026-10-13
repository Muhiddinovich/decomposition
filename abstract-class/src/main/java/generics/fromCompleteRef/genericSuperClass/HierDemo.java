package generics.fromCompleteRef.genericSuperClass;

public class HierDemo {

	public static void main(String[] args) {
		SubClass<String, Integer> subObj = new SubClass<String, Integer>(
				"The value is: ", 99);
		System.out.println(subObj.getSuperValue() + subObj.getSubValue());
	}

}
