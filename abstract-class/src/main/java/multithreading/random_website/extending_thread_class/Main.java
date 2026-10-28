package multithreading.random_website.extending_thread_class;

public class Main {

    public static void main(String[] args) {
	MyThread thread = new MyThread();
	thread.start();
	System.out.println("Main thread: " + Thread.currentThread().getName());
    }

}
