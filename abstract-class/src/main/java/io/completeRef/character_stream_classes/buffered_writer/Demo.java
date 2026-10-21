package io.completeRef.character_stream_classes.buffered_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\completeRef\\character_stream_classes\\buffered_writer\\data.txt";

		try (BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter(file))) {
			bufferedWriter.write("He he boi \n sup...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
