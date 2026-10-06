package generics.fromEpam.genericMethod2;

public class BoxProvider {
	public static <T> Box<T> box(T value) {
		return new Box<T>(value);
	}
}
