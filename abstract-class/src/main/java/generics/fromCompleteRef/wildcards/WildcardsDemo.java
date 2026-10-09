package generics.fromCompleteRef.wildcards;

public class WildcardsDemo {

	public static void main(String[] args) {
		Integer[] inums = {1, 2, 3, 5, 6, 7, 8, 9};
		Stats<Integer> stats = new Stats<>(inums);
		System.out.println(stats.average());

		Double[] dnums = {1.1, 2.2, 3.4, 6d, 10d};
		Stats<Double> dStats = new Stats<>(dnums);
		System.out.println(dStats.average());

		System.out.println(dStats.isAvgSame(stats));
	}

}
