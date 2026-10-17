package io.fromRandomWebsite.character_streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {

	public static void main(String[] args) {
		// `FileReader` reads character files and uses `BufferedReader` to read
		// lines efficiently.

		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\fromRandomWebsite\\character_streams\\text";

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
