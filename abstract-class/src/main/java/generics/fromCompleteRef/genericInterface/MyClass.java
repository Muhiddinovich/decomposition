package generics.fromCompleteRef.genericInterface;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {

	T[] vals;

	public MyClass(T[] vals) {
		this.vals = vals;
	}

	@Override
	public T min() {
		T min = vals[0];
		for (int i = 0; i < vals.length; i++) {
			if (vals[i].compareTo(min) < 0) {
				min = vals[i];
			}
		}
		return min;
	}

	@Override
	public T max() {
		T max;
		max = vals[0];
		for (int i = 0; i < vals.length; i++) {
			if (vals[i].compareTo(max) > 0) {
				max = vals[i];
			}
		}
		return max;
	}
}
