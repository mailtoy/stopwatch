package stopwatch;

/**
 * Append chars to a StringBuilder.
 * 
 * @author Kanchanok Kannee
 *
 */
public class AppendToStringBuilder implements Runnable {
	private int count;
	private String result;

	/**
	 * 
	 * Initialize the AppendToString with a specific count.
	 * 
	 * @param count is the length of the final String
	 * 
	 */
	public AppendToStringBuilder(int count) {
		this.result = "";
		this.count = count;
	}

	/**
	 * Add char 'a' to the String until final count
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
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
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %d", count, result.length());
	}

}
