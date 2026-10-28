package multithreading.random_website.implementing_runnable;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
	System.out.println("Running thread via Runnable: " + Thread.currentThread().getName());
    }

}
