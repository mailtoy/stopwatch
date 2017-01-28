package stopwatch;

/**
 * Append chars to a string.
 * 
 * @author Kanchanok Kannee
 *
 */
public class AppendToString implements Runnable {
	private int count;
	private String result = "";

	/**
	 * 
	 * Initialize the AppendToString with a specific count.
	 * 
	 * @param count is the length of the final String
	 * 
	 */
	public AppendToString(int count) {
		this.result = "";
		this.count = count;
	}

	/**
	 * Add char 'a' to the String until final count
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}

	}

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\nfinal string length = %d", count, result.length());
	}

}
