package stopwatch;

/**
 * Add double primitives from an array.
 * 
 * @author Kanchanok Kannee
 *
 */
public class SumDoublePrimitive implements Runnable {
	private double sum;
	private int counter;
	private static final int ARRAY_SIZE = 500000;
	double[] values = new double[ARRAY_SIZE];

	/**
	 * Initialize SumDoublePrimitive with the counter.
	 * 
	 * @param counter is how many times to add the number
	 */
	public SumDoublePrimitive(int counter) {
		this.counter = counter;

	}

	/**
	 * Add numbers from 1 to ARRAY_SIZE using primitive double. 
	 */
	@Override
	public void run() {
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
		sum = 0.0;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
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
		return String.format("Sum array of double primitives with count=%,d", counter) + "\nsum = " + sum;
	}

}
