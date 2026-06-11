package interface2;

public class Demo {

	public static void main(String[] args) {
		Call object = new Client();
		object.call();
		Client client = new Client();
		client.call();
		Base base = new Client();
		base.call();
		
	}

}
