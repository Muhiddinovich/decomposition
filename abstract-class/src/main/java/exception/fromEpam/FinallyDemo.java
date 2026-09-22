package exception.fromEpam;

public class FinallyDemo {

	static void methodA() {
		try {
			System.out.println("Method A");
			return;
		} finally {
			System.out.println("finally section of method A");
		}
	}

	static int methodB() {
		try {
			System.out.println("Method B");
			return 1;
		} finally {
			System.out.println("finally section of method B");
			 return 0;
		}
	}
	public static void main(String[] args) {
		methodA();
		System.out.println(methodB());
	}

}
