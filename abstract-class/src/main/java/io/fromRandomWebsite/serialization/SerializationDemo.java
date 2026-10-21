package io.fromRandomWebsite.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		Person person = new Person("John Doe", 30);
		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\fromRandomWebsite\\serialization\\person.ser";

		// Serialization
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file))) {
			oos.writeObject(person);
		} catch (IOException e) {
			System.out.println(e);
		}

		// Deserialization
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file))) {
			Person deserializedPerson = (Person) ois.readObject();
			System.out.println("Name: " + deserializedPerson.name);
			System.out.println("Age: " + deserializedPerson.age);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
