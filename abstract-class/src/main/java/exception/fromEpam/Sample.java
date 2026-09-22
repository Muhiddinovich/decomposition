package exception.fromEpam;

public class Sample {

	public static void main(String[] args) {
		String[] numbers = {"42", "0", "Y-", "33"};
		int result;
		int value = 0;
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			try {
				result = Integer.parseInt(numbers[i]);
				try {
					sum += 100 / result;
					Integer.parseInt("");  //skips this when / by zero is caught
				} catch (ArithmeticException e) {
					System.out.println("Arithmetic: " + e.getMessage());
				}
			} catch (NumberFormatException e) {
				System.out.println("NumberFormat: " + e.getMessage());
			}
		}
	}

}
