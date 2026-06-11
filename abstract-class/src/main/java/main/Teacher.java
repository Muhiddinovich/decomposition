package main;

public class Teacher extends Person {
	private String academicRank;

	/**
	 * @param id
	 * @param lastName
	 * @param academicRank
	 */
	public Teacher(long id, String lastName, String academicRank) {
		super(id, lastName);
		this.academicRank = academicRank;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString()).append("Teacher [academicRank=");
		builder.append(academicRank);
		builder.append("]");
		return builder.toString();
	}

}
