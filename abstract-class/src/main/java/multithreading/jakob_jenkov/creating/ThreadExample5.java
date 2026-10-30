package multithreading.jakob_jenkov.creating;

public class ThreadExample5 {

    public static void main(String[] args) {
	Runnable myRunnable = () -> {
	    System.out.println("MyRunnable running");
	    System.out.println("MyRunnable finished");
	};

	Thread myThread = new Thread(myRunnable);
	myThread.start();
    }

}
