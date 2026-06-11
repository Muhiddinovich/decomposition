package main;

public abstract class Person {
	private long id;
	private String lastName;

	/**
	 * @param id
	 * @param lastName
	 */
	public Person(long id, String lastName) {
		this.id = id;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=");
		builder.append(id);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append("]");
		return builder.toString();
	}

	
}
