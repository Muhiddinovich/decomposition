package io.completeRef.byte_stream_classes.fileInputOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {

		// FileOutPutStream
		String file = "C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\io\\completeRef\\byte_stream_classes\\fileInputOutputStreams\\data.bin";
		try (FileOutputStream fileOuputStream = new FileOutputStream(file)) {
			for (int i = 0; i < 100; i++) {
				fileOuputStream.write('C');
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (// FileInPutStream
				FileInputStream fileInputStream = new FileInputStream(file)) {
			int data;
			while ((data = fileInputStream.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
