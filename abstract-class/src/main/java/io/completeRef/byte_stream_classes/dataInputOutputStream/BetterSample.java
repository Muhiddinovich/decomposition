package io.completeRef.byte_stream_classes.dataInputOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BetterSample {

	public static void main(String[] args) {
		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\completeRef\\byte_stream_classes\\dataInputOutputStream\\data.bin";

		try (DataOutputStream dataOutputStream = new DataOutputStream(
				new FileOutputStream(file))) {
			dataOutputStream.writeInt(25);
			dataOutputStream.writeDouble(1.80);
			dataOutputStream.writeBoolean(true);
			dataOutputStream.writeUTF("John");

		} catch (IOException e) {
			e.printStackTrace();
		}

		// DataInputStream reads data in the same order and type that
		// DataOutputStream wrote it.
		try (DataInputStream dataInputStream = new DataInputStream(
				new FileInputStream(file))) {
			int age = dataInputStream.readInt();
			double height = dataInputStream.readDouble();
			boolean student = dataInputStream.readBoolean();
			String name = dataInputStream.readUTF();

			System.out.println(name);
			System.out.println(age);
			System.out.println(height);
			System.out.println(student);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
