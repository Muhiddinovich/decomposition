package io.fromRandomWebsite.byte_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream(
				"C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\fromRandomWebsite\\byte_stream\\example.txt")) {
			for (byte b : fis.readAllBytes()) {
				System.out.print((char) b);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	// - readAllBytes() reads the entire file into memory.
	// - The for-each loop processes each byte.
	// - (char) b converts each byte to a character.
	// 2. Is it good practice?
	// - Small files: Yes, readAllBytes() is convenient.
	// - Large files: Avoid it because the entire file must fit in memory.
	// - Non-English text: (char) b can display UTF-8 characters incorrectly.
	//
}
