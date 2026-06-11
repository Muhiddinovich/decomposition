package cloning.copy_constructor;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setAge(15);
		student1.setName("Fred");

		Student student2 = new Student(student1);
		System.out.println(student2);

	}
}
