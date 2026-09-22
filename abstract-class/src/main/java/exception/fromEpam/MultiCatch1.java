package exception.fromEpam;

public class MultiCatch1 {
	public static void main(String[] args) {
		String arr[] = {"12", "0", "-5", "sum"};

		for (String str : arr) {
			try {
				System.out.println(100 / (Integer.parseInt(str)));
			} catch (ArithmeticException | NumberFormatException e) {
				System.out.println("Here we go: " + e);
			}
		}

	}

}
