package io.fromRandomWebsite.byte_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) {
		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\fromRandomWebsite\\byte_output_stream\\chunkfile.txt";

		try (FileOutputStream fis = new FileOutputStream(file)) {
			fis.write("Hey hey".getBytes());
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
