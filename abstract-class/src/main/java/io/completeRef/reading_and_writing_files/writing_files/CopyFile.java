package io.completeRef.reading_and_writing_files.writing_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: CopyFile from to");
			return;
		}

		int i;
		FileInputStream fin = null;
		FileOutputStream fos = null;

		try {
			fin = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);

			do {
				i = fin.read();
				if (i != -1) {
					fos.write(i);
				}
			} while (i != -1);
			System.out.println("Success!");
		} catch (IOException e) {
			System.out.println("I/O Error: " + e);
		} finally {
			try {
				if (fin != null) {
					fin.close();
				}
			} catch (IOException e2) {
				System.out.println("Error closing the input file");
			}

			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing the output file");
			}
		}
	}
}
