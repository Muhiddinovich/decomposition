package io.fromRandomWebsite.byte_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\fromRandomWebsite\\byte_output_stream\\chunkfile.txt";

		try (FileOutputStream outputStream = new FileOutputStream(file)) {
			String sample = "Hey bro";
			outputStream.write(sample.getBytes());
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
