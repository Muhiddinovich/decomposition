package multithreading.jakob_jenkov.java_happens_before_guarantee;

import java.util.Scanner;

public class SharedMessage {
    private volatile boolean messageReady = false;
    private String message;

    public void writeMessage() {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter your message:");
	message = scanner.nextLine();

	messageReady = true;
    }

    public void readMessage() {
	while (!messageReady) { // spinning (Bad practice)
	    // Wait
	}

	System.out.println(message);
    }

}
