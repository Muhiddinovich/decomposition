package decomposition.action.conversation.command;

import decomposition.action.rational.RationalNumber;

public class PrintQuotientComman extends Command {
	private RationalNumber first;
	private RationalNumber second;

	/**
	 * @param tag
	 * @param first
	 * @param second
	 */
	public PrintQuotientComman(String tag, RationalNumber first, RationalNumber second) {
		super(tag);
		this.first = first;
		this.second = second;
	}

	@Override
	public void execute() {
		System.out.println("Product is " + first.divideBy(second));
	}

}
