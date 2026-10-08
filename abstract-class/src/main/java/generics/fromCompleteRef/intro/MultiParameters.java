package generics.fromCompleteRef.intro;

public class MultiParameters<T, V> {
	T ob;
	V obV;

	/**
	 * @param ob
	 * @param obV
	 */
	public MultiParameters(T ob, V obV) {
		super();
		this.ob = ob;
		this.obV = obV;
	}

	public T getOb() {
		return ob;
	}

	public V getObV() {
		return obV;
	}

	void showTypeOf() {
		System.out.println("Type of T is " + ob.getClass()
				.getName());
		System.out.println("Type of V is " + obV.getClass()
				.getName());
	}
}
