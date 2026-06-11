package main;

public class Student extends Person {

	private double averageMark;

	/**
	 * @param id
	 * @param lastName
	 * @param averageMark
	 */
	public Student(long id, String lastName, double averageMark) {
		super(id, lastName);
		this.averageMark = averageMark;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(super.toString()).append("Student [averageMark=");
		builder.append(averageMark);
		builder.append("]");
		return builder.toString();
	}

}
