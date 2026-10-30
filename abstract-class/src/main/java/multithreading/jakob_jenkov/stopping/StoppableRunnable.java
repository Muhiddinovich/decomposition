package multithreading.jakob_jenkov.stopping;

public class StoppableRunnable implements Runnable {
    private boolean stopRequested = false;

    public synchronized void requestStop() {
	this.stopRequested = true;
    }

    public synchronized boolean isStopRequeste() {
	return this.stopRequested;
    };

    private void sleep(long millis) {
	try {
	    Thread.sleep(millis);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    @Override
    public void run() {
	System.out.println("StoppableRunnable started");
	while (!isStopRequeste()) {
	    sleep(900);
	    System.out.println("...");
	}
	System.out.println("Finished");

    }

    public static void main(String[] args) {
	StoppableRunnable stoppableRunnable = new StoppableRunnable();
	Thread thread = new Thread(stoppableRunnable, "Thread1");
	thread.start();

	try {
	    Thread.sleep(10000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	System.out.println("requesting stop");
	stoppableRunnable.requestStop();
	System.out.println("stop requested");
    }

}
