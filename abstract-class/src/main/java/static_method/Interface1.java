package static_method;

public interface Interface1 {
	default void print(String str) {
		if (!isNull(str)) {
			System.out.println("Data. Prints line: " + str);
		}
	}

	static boolean isNull(String str) {
		System.out.println("Static method null checking");
		return str == null ? true : "".equals(str.trim()) ? true : false;
	}
}
