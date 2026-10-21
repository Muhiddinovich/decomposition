package io.fromRandomWebsite.characterWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\fromRandomWebsite\\characterWriter\\data.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("llasdasd");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
