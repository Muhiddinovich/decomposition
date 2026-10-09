package generics.fromCompleteRef.wildcards;

public class Stats<T extends Number> {
	T[] ob;

	public Stats(T[] ob) {
		super();
		this.ob = ob;
	}

	double average() {
		double sum = 0;
		for (int i = 0; i < ob.length; i++) {
			sum += ob[i].doubleValue();
		}

		return sum / ob.length;
	}
	boolean isAvgSame(Stats<?> ob) {
		if (average() == ob.average()) {
			return true;
		}
		return false;
	}
}
