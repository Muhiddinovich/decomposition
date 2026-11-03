package multithreading.jakob_jenkov.java_happens_before_guarantee;

public class Main {

    public static void main(String[] args) {
	SharedMessage shared = new SharedMessage();
	Thread writer = new Thread(() -> {
	    shared.writeMessage();
	});
	Thread reader = new Thread(() -> {
	    shared.readMessage();
	});

	reader.start();
	writer.start();
    }

}
