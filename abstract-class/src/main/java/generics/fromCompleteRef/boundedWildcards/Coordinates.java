package generics.fromCompleteRef.boundedWildcards;

public class Coordinates<T extends TwoD> {
	T[] ob;

	public Coordinates(T[] o) {
		this.ob = o;
	}

}
