package exception.fromEpam;

public class MultiCatch {

	public static void main(String[] args) {
		String arr[] = { "12", "34","-5"};
		try {
			for (String str : arr) {
				System.out.println(Integer.parseInt(str));
			}

			int i = 10;
			int l = 0;

			System.out.println("bla bla bla" + i / l);

		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Here we go: " + e.getMessage());
		}
	}

}
