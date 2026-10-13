package generics.fromCompleteRef.genericInterface;

public interface MinMax<T extends Comparable<T>> {
	T min();
	T max();
}
