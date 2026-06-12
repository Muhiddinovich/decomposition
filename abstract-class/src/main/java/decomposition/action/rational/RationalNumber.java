package decomposition.action.rational;

public class RationalNumber {
	private final int numerator;
	private final int denominator;

	public RationalNumber(final int numerator, final int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("Denominator for a RationalNumber must not be zero");
		}
		int gcd = gcd(numerator, denominator);
		this.numerator = numerator / gcd;
		this.denominator = denominator / gcd;
	}

	@Override
	public String toString() {
		return numerator == 0 ? "0" : numerator + "/" + denominator;
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

	public RationalNumber divideBy(final RationalNumber other) {

		return multiply(new RationalNumber(other.denominator, other.numerator));

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
