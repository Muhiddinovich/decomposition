package generics.fromCompleteRef.bridge_method;

public class Main {

	public static void main(String[] args) {
		for (var method : Child.class.getDeclaredMethods()) {
			System.out.println(
					method.getName() + " | Bridge: " + method.isBridge());
		}
	}

}
