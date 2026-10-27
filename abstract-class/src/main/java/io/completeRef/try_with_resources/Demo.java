package io.completeRef.try_with_resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) {
	int i;
	if (args.length != 1)
	    return;

	try (var fin = new FileInputStream(args[0])) {
	    do {
		i = fin.read();
		System.out.print((char) i);
	    } while (i != -1);
	} catch (FileNotFoundException e) {
	    System.err.println("File not found: " + e);
	} catch (IOException e) {
	    System.err.println("I/O error");
	}
    }

}
