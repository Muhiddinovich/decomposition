package io.completeRef.byte_stream_classes.byteArrayInputOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Demo {

	public static void main(String[] args) {

		// ByteArrayInputStream
		byte[] data = {65, 66, 67};
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
				data);
		int b;
		while ((b = byteArrayInputStream.read()) != -1) {
			System.out.println((char) b);
		}

		// ByteArrayOutputStream

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byteArrayOutputStream.write(65);
		byteArrayOutputStream.write(66);
		byteArrayOutputStream.write(65);

		byte[] myData = byteArrayOutputStream.toByteArray();
		System.out.println(new String(myData));
	}

}
