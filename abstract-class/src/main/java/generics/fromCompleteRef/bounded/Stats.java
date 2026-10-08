package generics.fromCompleteRef.bounded;

public class Stats<T extends Number> {
	T[] ob;

	/**
	 * @param ob
	 */
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
}
