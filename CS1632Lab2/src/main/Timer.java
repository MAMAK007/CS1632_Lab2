package main;

public class Timer {
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    // Starts the timer
    public void start() {
        this.startTime = System.nanoTime();
        this.running = true;
    }

    // Stops the timer
    public void stop() {
        this.stopTime = System.nanoTime();
        this.running = false;
    }

    // Returns elapsed time in milliseconds (including fractional ms)
    public double getElapsedMilliseconds() {
        long elapsed = running ? (System.nanoTime() - startTime) : (stopTime - startTime);
        return elapsed / 1_000_000.0;
    }

    // Optional: Resets the timer
    public void reset() {
        this.startTime = 0;
        this.stopTime = 0;
        this.running = false;
    }
}
