package exception.fromEpam.throwsDemo;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		try {
			parent.test();
		} catch (IOException e) {
			System.out.println(e);
		}

		Parent parent2 = new Child();
		try {
			parent2.test();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Child child = new Child();
		child.test();
	}

}
