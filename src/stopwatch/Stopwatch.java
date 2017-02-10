package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Kanchanok Kannee
 * @version 1.0
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds */
	private long stopTime;
	/** a boolean indicates whether the stopwath is running or not */
	private boolean running;

	/**
	 * Initialize the ruunning.
	 */
	public Stopwatch() {
		this.running = false;

	}

	/** Start the stopwatch if it is not already running. */
	public void start() {
		if (this.running == false) {
			this.startTime = System.nanoTime();
			this.running = true;
		}

	}

	/** Stop the stopwatch if it is already running. */
	public void stop() {
		if (this.running == true) {
			this.stopTime = System.nanoTime();
			this.running = false;
		}

	}

	/**
	 * Return the elapsed time in seconds with decimal. There are 2 cases: If
	 * the stopwatch is running, then return the elapsed time since start until
	 * the current time. If stopwatch is stopped, then return the time between
	 * the start and stop times.
	 * 
	 * @return the elapsed time in seconds with decimal
	 */
	public double getElapsed() {

		if (this.running == true) {
			return (System.nanoTime() - this.startTime) * NANOSECONDS;
		} else {
			return (this.stopTime - this.startTime) * NANOSECONDS;
		}

	}

	/**
	 * Check boolean the stopwatch is running or not.
	 * 
	 * @return true if the stopwatch is running, false if stopwatch is stopped.
	 */
	public boolean isRunning() {
		return this.running;
		

	}

}
