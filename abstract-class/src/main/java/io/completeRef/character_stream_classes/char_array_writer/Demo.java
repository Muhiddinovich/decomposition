package io.completeRef.character_stream_classes.char_array_writer;

import java.io.CharArrayWriter;

public class Demo {

	public static void main(String[] args) {
		char[] chars;
		CharArrayWriter charArrayWriter = new CharArrayWriter();
		charArrayWriter.write('H');
		charArrayWriter.write('E');
		charArrayWriter.write('L');
		charArrayWriter.write('L');
		charArrayWriter.write('O');
		charArrayWriter.write('O');

		chars = charArrayWriter.toCharArray();
		System.out.println(new String(chars));
	}

}
