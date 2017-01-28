package stopwatch;

import java.math.BigDecimal;

/**
 * Add BigDecimal from an array.
 * 
 * @author Kanchanok Kannee
 *
 */
public class SumBigDecimal implements Runnable {

	private int counter;
	private static final int ARRAY_SIZE = 500000;
	private BigDecimal sum = new BigDecimal(0.0);

	/**
	 * Initialize BigDecimal with the counter.
	 * 
	 * @param counter is how many times to add the number
	 */
	public SumBigDecimal(int counter) {
		this.counter = counter;
	}

	/**
	 * Add numbers from 1 to ARRAY_SIZE using BigDecimal class. 
	 */
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}

	}

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d", counter) + "\nsum = " + sum;
	}

}
