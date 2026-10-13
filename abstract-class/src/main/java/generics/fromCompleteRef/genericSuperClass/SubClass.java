package generics.fromCompleteRef.genericSuperClass;

public class SubClass<T, V> extends SuperClass<T> {
	private V subValue;

	public SubClass(T value, V subValue) {
		super(value);
		this.subValue = subValue;
	}

	public V getSubValue() {
		return subValue;
	}

}
