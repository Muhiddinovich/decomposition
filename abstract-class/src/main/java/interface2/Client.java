package interface2;

public class Client extends Base implements Call {
	public void call() {
		System.out.println("сall() of class Client: NUM = " + NUM);
		super.call();
	}

	public void test() {
		System.out.println("Tested");
	}
}
