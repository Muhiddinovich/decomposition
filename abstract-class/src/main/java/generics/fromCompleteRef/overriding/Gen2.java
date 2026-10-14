package generics.fromCompleteRef.overriding;

public class Gen2<T> extends Gen<T> {

	public Gen2(T ob) {
		super(ob);
	}

	@Override
	public T getOb() {
		System.out.print("Gen2's getOb(): ");
		return ob;
	}
}
