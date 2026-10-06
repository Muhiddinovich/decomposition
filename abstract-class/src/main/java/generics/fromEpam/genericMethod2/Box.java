package generics.fromEpam.genericMethod2;

public class Box<T> {
	private T value;
	public Box(T value) {
		this.value = value;
	}

	public static <V> Box<V> name(V value) {
		return new Box<>(value);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box{value=");
		builder.append(value);
		builder.append(", Type: ");
		builder.append(value.getClass());
		builder.append("}");
		return builder.toString();
	}

}
