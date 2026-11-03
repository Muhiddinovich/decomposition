package multithreading.jakob_jenkov.java_happens_before_guarantee;

import java.awt.Frame;

public class FrameExchanger {
    private volatile long framesStoredCount = 0;
    private volatile long framesTakenCount = 0;
    private volatile boolean hasNewFrame = false;
    private volatile Frame frame = null;

    public void storeFrame(Frame frame) {
	this.frame = frame;
	this.framesStoredCount++;
	this.hasNewFrame = true;
    }

    public Frame takenFrame() {
	while (!hasNewFrame) {
	    // busy wait until new frame arrives
	    System.out.println("...");
	}
	Frame newFrame = this.frame;
	this.framesTakenCount++;
	this.hasNewFrame = false;
	return newFrame;
    }
}
