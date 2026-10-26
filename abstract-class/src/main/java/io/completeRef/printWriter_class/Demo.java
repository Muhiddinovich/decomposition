package io.completeRef.printWriter_class;

import java.io.PrintWriter;

public class Demo {

    public static void main(String[] args) {
	try (PrintWriter pw = new PrintWriter(System.out, true)) {
	    pw.println("This is a text");
	    pw.println(-7);
	}
    }

}
