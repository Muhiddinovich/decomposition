package interface_demo;

public class Circle implements Shape {

	double radius;

	public Circle(double x) {
		radius = x;
	}

	@Override
	public double getSquare() {

		return PI * radius * radius;
	}

	void call() {
		System.out.println("Called");
	}
}
