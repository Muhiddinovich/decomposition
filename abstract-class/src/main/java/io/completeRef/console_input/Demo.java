package io.completeRef.console_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Demo {

    public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

	System.out.println("Enter name: ");
	try {
	    String name = br.readLine();
	    System.out.println(name);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
