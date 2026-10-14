package generics.fromCompleteRef.overriding;

public class Gen<T> {
	T ob;

	public Gen(T ob) {
		super();
		this.ob = ob;
	}

	public T getOb() {
		System.out.print("Gen's getOb(): ");
		return ob;
	}

}
