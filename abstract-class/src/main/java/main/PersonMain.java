package main;

public class PersonMain {

	public static void main(String[] args) {
		Person teacher = new Teacher(1233, "Mike", "Principal");
		Person student = new Student(123, "Craig", 95);

		System.out.println(teacher.toString());
		System.out.println(student.toString());
	}

}
