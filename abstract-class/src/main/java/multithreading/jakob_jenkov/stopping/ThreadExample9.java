package multithreading.jakob_jenkov.stopping;

public class ThreadExample9 {

    public static void sleep(long millis) {
	try {
	    Thread.sleep(millis);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	Runnable runnable = () -> {
	    for (int i = 0; i < 5; i++) {
		sleep(1000);
		System.out.println("runnning");
	    }

	};
	Thread thread = new Thread(runnable);
	thread.start();

	try {
	    thread.join();
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	System.out.println(Thread.currentThread().getName());
    }

}
