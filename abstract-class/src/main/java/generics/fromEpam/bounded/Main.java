package generics.fromEpam.bounded;

public class Main {

	public static void main(String[] args) {
		Div<Integer> ob = new Div<>(1253, 43);
		System.out.println(ob.perform());

	}

}
