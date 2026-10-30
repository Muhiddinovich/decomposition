package multithreading.jakob_jenkov.creating;

public class MyThread extends Thread {
    @Override
    public void run() {
	System.out.println("MyThread running");
	System.out.println("MyThread finished");
    }
}
