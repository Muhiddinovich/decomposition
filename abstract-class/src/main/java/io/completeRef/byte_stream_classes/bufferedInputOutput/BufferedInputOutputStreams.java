package io.completeRef.byte_stream_classes.bufferedInputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStreams {

	public static void main(String[] args) {

		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\completeRef\\byte_stream_classes\\bufferedInputOutput\\hello.txt";

		// BufferedInputStream
		try (BufferedInputStream inputStream = new BufferedInputStream(
				new FileInputStream(file))) {
			int data;
			while ((data = inputStream.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (IOException e) {
			System.out.println(e);
		}

		// BufferedOutputStream

		String file1 = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\completeRef\\byte_stream_classes\\bufferedInputOutput\\bos.txt";
		try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream(file1))) {
			for (int i = 0; i < 100; i++) {
				bufferedOutputStream.write(66);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	// FileInputStream
	//
	// ByteArrayInputStream
	//
	// PipedInputStream
	//
	// SequenceInputStream
	//
	// ObjectInputStream
	//
	// FilterInputStream

	// FileOutputStream
	//
	// ByteArrayOutputStream
	//
	// PipedOutputStream
	//
	// ObjectOutputStream
	//
	// FilterOutputStream

}
