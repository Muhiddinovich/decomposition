package io.completeRef.reading_and_writing_files.a;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) {
	int i;
	FileInputStream fin;

	// confirm filename has been specified
	if (args.length != 1) {
	    System.err.println("Usage: filename");
	    return;
	}

	try {
	    fin = new FileInputStream(args[0]);
	} catch (IOException e) {
	    System.out.println("Cannot open file");
	    return;
	}

	// At this point file is already open and can be read
	// The following reads characters until EOF is encountered

	try {
	    do {
		i = fin.read();
		if (i != -1) {
		    System.out.print((char) i);
		}
	    } while (i != -1);
	} catch (IOException e) {
	    // TODO: handle exception
	    System.out.println("Error reading file: " + e);
	}

	try {
	    fin.close();
	} catch (IOException e) {
	    // TODO: handle exception
	    System.out.println("Error closing file: " + e);
	}
    }

}
