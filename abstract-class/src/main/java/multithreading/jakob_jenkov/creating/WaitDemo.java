package multithreading.jakob_jenkov.creating;

public class WaitDemo {

    public static void main(String[] args) {
	Runnable runnable = () -> {
	    String threadName = Thread.currentThread().getName();
	    System.out.println(threadName + " running");
	    try {
		Thread.sleep(3000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	    System.out.println(threadName + " finished");
	};

	Thread thread = new Thread(runnable, "Thread1");
	thread.start();
    }

}
