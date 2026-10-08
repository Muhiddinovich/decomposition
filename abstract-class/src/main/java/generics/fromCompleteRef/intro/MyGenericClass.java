package generics.fromCompleteRef.intro;

public class MyGenericClass<T> {
	T ob;

	public MyGenericClass(T ob) {
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	void showTypeOf() {
		System.out.println("Type of T is " + ob.getClass()
				.getName());
	}
}
