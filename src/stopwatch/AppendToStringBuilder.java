package stopwatch;

/**
 * Append chars to a StringBuilder.
 * 
 * @author Kanchanok Kannee
 *
 */
public class AppendToStringBuilder implements Runnable {
	private int size;
	private String result;

	/**
	 * 
	 * Initialize the AppendToString with a specific count.
	 * 
	 * @param size is the length of the final String
	 * 
	 */
	public AppendToStringBuilder(int size) {
		this.result = "";
		this.size = size;
	}

	/**
	 * Add char 'a' to the String until final size
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < size) {
			builder = builder.append(CHAR);
		}
		result = builder.toString();

	}

	/**
	 * Return the Task's description.
	 * 
	 * @return the description of the task
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %d", size, result.length());
	}

}
