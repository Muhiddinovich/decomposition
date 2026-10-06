package generics.fromEpam.genericMethod2;


public class Main {

	public static void main(String[] args) {
		Box<String> boxWithString = new Box<String>("1");
		Box<Integer> boxWithInteger = BoxProvider.<Integer>box(2);

		System.out.println(boxWithString);
		System.out.println(boxWithInteger);
		
	}

}
