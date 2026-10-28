package multithreading.random_website.extending_thread_class;

public class MyThread extends Thread {
    public void run() {
	System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}
