package generics.fromCompleteRef.genericSubClass;

public class GenericSubClass<T> extends NonGenericSuper {
	T ob;

	public GenericSubClass(T ob, int num) {
		super(num);
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

}
