package multithreading.random_website.implementing_runnable;

public class Main {

    public static void main(String[] args) {
	Thread thread = new Thread(new MyRunnable());
	thread.start();
    }

}
