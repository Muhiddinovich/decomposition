package io.completeRef.reading_strings_from_console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Demo {

    public static void main(String[] args) {
	String line;
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
	    System.out.println("Enter line of text, stop to quit");
	    do {
		line = br.readLine();
		System.out.println(line);
	    } while (!line.equals("stop"));
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
