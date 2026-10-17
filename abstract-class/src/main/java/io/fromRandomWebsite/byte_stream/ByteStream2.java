package io.fromRandomWebsite.byte_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) {
		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\fromRandomWebsite\\byte_stream\\random.txt";
		try (FileInputStream fis = new FileInputStream(file)) {
			// Create a buffer that can hold up to 8,192 bytes (8 KiB)
			byte[] buffer = new byte[8192];

			// Stores the number of bytes actually read during each read
			// operation
			int bytesRead;

			// Read up to 8,192 bytes at a time.
			// Continue looping until read() returns -1, meaning end of file
			// (EOF).
			while ((bytesRead = fis.read(buffer)) != -1) {

				// Process only the bytes that were actually read into the
				// buffer.
				// bytesRead might be less than 8,192.
				for (int i = 0; i < bytesRead; i++) {

					// Get one byte from the buffer, convert it to a character,
					// and print it without moving to a new line.
					System.out.print((char) buffer[i]);
				}
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
