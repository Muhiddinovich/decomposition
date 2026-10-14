package generics.fromCompleteRef.genericSubClass;

public class Main {

	public static void main(String[] args) {
		GenericSubClass<String> class1 = new GenericSubClass<String>(
				"The number is", 63);
		System.out.println(class1.getOb());
		System.out.println(class1.getNum());
	}
}
