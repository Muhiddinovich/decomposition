package decomposition.action;

public class PrintProductCommand extends Command {
	private final RationalNumber first;
	private final RationalNumber second;

	/**
	 * @param tag
	 * @param first
	 * @param second
	 */
	public PrintProductCommand(String tag, RationalNumber first, RationalNumber second) {
		super(tag);
		this.first = first;
		this.second = second;
	}

	@Override
	public void execute() {
		System.out.println("Product is: " + first.multiply(second));
	}

}
