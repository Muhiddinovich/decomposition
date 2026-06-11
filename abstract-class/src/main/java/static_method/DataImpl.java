package static_method;

public class DataImpl implements Interface1 {

	public boolean isNull(String str) {
		System.out.println("Null check ");
		return str == null;
	}

	public static void main(String[] args) {
		Interface1 object = new DataImpl();
		object.print("hey");
		DataImpl classObject = new DataImpl();
		classObject.print("bla");
		classObject.isNull("");
		Interface1.isNull("asd");
		System.err.print("TeEEEEEEEEst");
	}

}
