package interface_demo;

public class Main {

	public static void main(String[] args) {
		Shape object = new Circle(7.6);
		System.out.println(object.getSquare());
		Circle circle = new Circle(5);
		circle.call();
		circle.getSquare();
	}

}
