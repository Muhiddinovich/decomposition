package generics.fromEpam.multiTypeParameters;

public class Main {
	public static void main(String[] args) {
		KeyValueImpl<Integer, String> object = new KeyValueImpl<>();
		object.setKey(13);
		object.setValue("This number is horrible");

		System.out.println(object.ValueDemo());

		KeyValueImpl obeject2 = new KeyValueImpl(); // raw type

	}
}
