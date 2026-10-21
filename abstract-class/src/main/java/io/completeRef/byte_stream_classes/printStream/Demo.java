package io.completeRef.byte_stream_classes.printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo {
	public static void main(String[] args) {
		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\completeRef\\byte_stream_classes\\printStream\\output.txt";

		try (PrintStream out = new PrintStream(new FileOutputStream(file))) {
			out.println("Hello java");
			out.print(false);
			out.println(25);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
