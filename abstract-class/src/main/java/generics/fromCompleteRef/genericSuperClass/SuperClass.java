package generics.fromCompleteRef.genericSuperClass;

public class SuperClass<T> {
	private T superValue;

	public SuperClass(T value) {
		this.superValue = value;
	}

	public T getSuperValue() {
		return superValue;
	}

}
