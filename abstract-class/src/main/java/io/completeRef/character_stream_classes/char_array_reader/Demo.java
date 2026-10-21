package io.completeRef.character_stream_classes.char_array_reader;

import java.io.CharArrayReader;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		char[] chars = {'H', 'E', 'L', 'L', 'L', 'O', 'O'};

		int data;
		try (CharArrayReader charArrayReader = new CharArrayReader(chars);) {
			while ((data = charArrayReader.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
