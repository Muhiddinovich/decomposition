package generics.fromCompleteRef.boundedWildcards;

public class Coordinates<T extends TwoD> {
	T[] coordinates;

	public Coordinates(T[] o) {
		this.coordinates = o;
	}

}
