package decomposition.action.conversation.command;

public abstract class Command {
	private final String tag;

	public Command(final String tag) {
		this.tag = tag;
	}

	public boolean hasTag(String s) {
		return this.tag.equalsIgnoreCase(s);
	}

	public String getTag() {
		return this.tag;
	}

	public abstract void execute();

}
