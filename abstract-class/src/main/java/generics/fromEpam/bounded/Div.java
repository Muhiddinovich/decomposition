package generics.fromEpam.bounded;

public class Div<T extends Number> {
	private T x;
	private T y;

	Div(T a, T b) {
		this.x = a;
		this.y = b;
	}
	public int perform() {
		return (int) (x.doubleValue() / y.doubleValue());
	}
}
