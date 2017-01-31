package stopwatch;

/**
 * Append chars to a string.
 * 
 * @author Kanchanok Kannee
 *
 */
public class AppendToString implements Runnable {
	private int size;
	private String result = "";

	/**
	 * 
	 * Initialize the AppendToString with a specific count.
	 * 
	 * @param size is the length of the final String
	 * 
	 */
	public AppendToString(int size) {
		this.result = "";
		this.size = size;
	}

	/**
	 * Add char 'a' to the String until final size
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		int k = 0;
		while (k++ < size) {
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
		return String.format("Append %,d chars to String\nfinal string length = %d", size, result.length());
	}

}
