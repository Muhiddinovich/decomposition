package io.completeRef.reading_strings_from_console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class TextEditor {

    public static void main(String[] args) {
	String[] str = new String[100];
	String line;
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
	    System.out.println("Enter lines of text up to 100 lines");
	    System.out.println("Or 'stop'");
	    for (int i = 0; i < 100; i++) {
		line = br.readLine();
		if (line.equals("stop"))
		    break;
		str[i] = line;
	    }

	} catch (IOException e) {
	    e.printStackTrace();
	}

	System.out.println("Your file:");
	Stream.of(str).forEach(System.out::println);

    }

}
