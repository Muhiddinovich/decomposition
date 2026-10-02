package generics.fromEpam.genericMethod;

public class GenericMethod {

	public static <T> byte asByte(T num) {
		if (num instanceof Number) {
			return ((Number) num).byteValue();
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(asByte(Integer.valueOf(30543)));
	}

}
