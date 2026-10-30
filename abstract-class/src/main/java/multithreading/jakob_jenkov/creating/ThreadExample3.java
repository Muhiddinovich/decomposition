package multithreading.jakob_jenkov.creating;

public class ThreadExample3 {
    public static class MyRunnable implements Runnable {
	@Override
	public void run() {
	    System.out.println("MyRunnable running");
	    System.out.println("MyRunnable finished");
	}
    }

    public static void main(String[] args) {
	Thread myThread = new Thread(new MyRunnable());
	myThread.start();
    }

}
