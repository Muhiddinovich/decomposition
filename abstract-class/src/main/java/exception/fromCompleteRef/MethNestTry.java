package exception.fromCompleteRef;

public class MethNestTry {

	static void nestTry(int i) {

		int b = 42 / i;
		System.out.println("a= " + i);

		try {
			if (i == 1) {
				i = i / (i - i);
			}
			if (i == 2) {
				int[] c = {1};
				c[42] = 99;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		try {
			int a = args.length;
			nestTry(a);

		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
