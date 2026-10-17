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
		System.out.println();
		try {
			FileReader reader = new FileReader(file);
			int char1;
			while ((char1 = reader.read()) != -1) {
				System.out.print((char) char1);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
