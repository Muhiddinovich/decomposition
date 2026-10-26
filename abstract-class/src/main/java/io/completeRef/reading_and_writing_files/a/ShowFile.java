package io.completeRef.reading_and_writing_files.a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {
	int i;
	FileInputStream fin = null;

	// confirm filename has been specified
	if (args.length != 1) {
	    System.err.println("Usage: filename");
	    return;
	}

	try {
	    fin = new FileInputStream(args[0]);
	    do {
		i = fin.read();
		if (i != -1) {
		    System.out.print((char) i);
		}
	    } while (i != -1);
	} catch (FileNotFoundException e) {
	    System.out.println("file not found " + e);
	} catch (IOException e) {
	    System.out.println("An I/O error occured " + e);
	} finally {
	    try {
		if (fin != null) {
		    fin.close();
		}
	    } catch (IOException e) {
		// TODO: handle exception
		System.out.println("Error closing file: " + e);
	    }
	}

    }

}
