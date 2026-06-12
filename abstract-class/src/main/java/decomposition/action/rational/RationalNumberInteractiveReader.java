package decomposition.action.rational;

import java.util.Scanner;

public class RationalNumberInteractiveReader {
	private final String name;

	public RationalNumberInteractiveReader(final String name) {
		this.name = name;
	}

	public RationalNumber read() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Entering %s", name);
		System.out.println();

		System.out.println("Numerator: ");
		int numerator = scanner.nextInt();
		System.out.println("Denominator: ");
		int denominator = scanner.nextInt();

		return new RationalNumber(numerator, denominator);
	}

}
