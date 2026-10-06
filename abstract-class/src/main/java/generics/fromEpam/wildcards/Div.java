package generics.fromEpam.wildcards;

public class Div<T extends Number> {
	private T a;
	private T b;

	public Div(T a, T b) {
		this.a = a;
		this.b = b;
	}

	public int perform() {
		return (int) (a.doubleValue() / b.doubleValue());
	}

	public boolean equalsDiv(Div<?> data) {
		return (this.perform() == data.perform());
	}
}
