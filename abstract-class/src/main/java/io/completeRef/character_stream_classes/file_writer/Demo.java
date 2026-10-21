package io.completeRef.character_stream_classes.file_writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\completeRef\\character_stream_classes\\file_writer\\data.txt";
		try (FileWriter fileWriter = new FileWriter(file, true)) {
			fileWriter.write("asda");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
