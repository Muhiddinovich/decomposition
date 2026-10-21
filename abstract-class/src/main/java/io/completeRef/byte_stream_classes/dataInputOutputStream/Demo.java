package io.completeRef.byte_stream_classes.dataInputOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				DataOutputStream dataOutputStream = new DataOutputStream(
						byteArrayOutputStream)) {
			dataOutputStream.writeInt(10);
			dataOutputStream.writeBoolean(false);
			dataOutputStream.writeDouble(3.14);

			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
					byteArrayOutputStream.toByteArray());
			DataInputStream in = new DataInputStream(byteArrayInputStream);
			System.out.println(in.readInt());
			System.out.println(in.readBoolean());
			System.out.println(in.readFloat());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
