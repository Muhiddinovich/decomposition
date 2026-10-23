package io.completeRef.reading_characters_from_console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Demo {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
	char c;
	System.out.println("Enter characters, q to quit: ");
	do {
	    c = (char) br.read();
	    System.out.println(c);

	} while (c != 'q');
    }

}
