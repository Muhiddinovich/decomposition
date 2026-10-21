package io.completeRef.character_stream_classes.file_reader;

import java.io.FileReader;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\completeRef\\character_stream_classes\\file_reader\\data.txt";
		try (FileReader fileReader = new FileReader(file)) {
			int data;
			while ((data = fileReader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
