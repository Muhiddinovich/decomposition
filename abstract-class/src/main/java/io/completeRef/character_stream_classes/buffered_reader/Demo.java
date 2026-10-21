package io.completeRef.character_stream_classes.buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\completeRef\\character_stream_classes\\buffered_reader\\data.txt";
		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader(file))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
