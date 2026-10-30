package multithreading.jakob_jenkov.virtual_threads;

import java.util.ArrayList;
import java.util.List;

public class VirtualThreadExample3 {

    public static void main(String[] args) {
	List<Thread> vThreads = new ArrayList<>();
	int vThreadCount = 100_000;
	for (int i = 0; i < vThreadCount; i++) {
	    int vThreadIndex = i;
	    Thread vThread = Thread.ofVirtual().start(() -> {
		for (int j = 0; j < 10; j++) {
		    System.out.print(j);
		}
	    });
	    vThreads.add(vThread);
	}

	for (int i = 0; i < vThreads.size(); i++) {
	    try {
		vThreads.get(i).join();
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }

}
