package decomposition.action;

public class RationalNumber {
	private final int numerator;
	private final int denominator;

	public RationalNumber(final int numerator, final int denominator) {
		int gcd = gcd(numerator, denominator);
		this.numerator = numerator / gcd;
		this.denominator = denominator / gcd;
	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}

	public RationalNumber add(RationalNumber other) {
		int commonDenominator = this.denominator * other.denominator;
		int sumNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
		return new RationalNumber(sumNumerator, commonDenominator);
	}

	public RationalNumber multiply(RationalNumber other) {
		int productNumerator = this.numerator * other.numerator;
		int productDenominator = this.denominator * other.denominator;
		return new RationalNumber(productNumerator, productDenominator);
	}

	private static int gcd(int a, int b) {
		if (a < 0)
			a = -a;
		if (b < 0)
			b = -b;
		if (0 == b)
			return a;
		else
			return gcd(b, a % b);
	}
}
