package io.completeRef.try_with_resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {
	int i;

	if (args.length != 2) {
	    System.err.println("Incorrect numbers of args");
	    return;
	}

	try (var fin = new FileInputStream(args[0]); var fout = new FileOutputStream(args[1])) {
	    do {
		i = fin.read();
		if (i != -1) {
		    fout.write(i);
		}
	    } while (i != -1);

	} catch (IOException e) {
	    System.err.println("I/O Error");
	}
	System.out.println("Success!");
    }

}
