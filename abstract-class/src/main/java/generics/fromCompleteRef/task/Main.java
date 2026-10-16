package generics.fromCompleteRef.task;

public class Main {

	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>(90);
		Box<String> box2 = new Box<String>("Test");
		System.out.println(box.getItem());
		System.out.println(box2.getItem());
	}

}
