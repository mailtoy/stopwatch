package stopwatch;

/**
 * Add Double objects from an array.
 * 
 * @author Kanchanok Kannee
 *
 */
public class SumDouble implements Runnable {
	private int counter;
	private static final int ARRAY_SIZE = 500000;
	private Double sum = new Double(0.0);
	Double[] values = new Double[ARRAY_SIZE];

	/**
	 * Initialize SumDouble with the counter.
	 * 
	 * @param counter is how many times to add the number
	 */
	public SumDouble(int counter) {
		this.counter = counter;

	}

	/**
	 * Add numbers from 1 to ARRAY_SIZE using Double wrapper class. 
	 */
	@Override
	public void run() {
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}

	}

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d", counter) + "\nsum = " + sum;
	}

}
