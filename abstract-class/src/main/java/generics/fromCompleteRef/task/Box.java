package generics.fromCompleteRef.task;

public class Box<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public Box(T item) {
		this.item = item;
	}

}
