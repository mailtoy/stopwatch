package stopwatch;

import java.io.IOException;

public class Main {
	public static void main (String [] args ) {
		TaskTimer taskTimer = new TaskTimer();
		
		taskTimer.measureAndPrint(new AppendToString(50000));
		taskTimer.measureAndPrint(new AppendToString(100000));
		taskTimer.measureAndPrint(new AppendToStringBuilder(100000));
		taskTimer.measureAndPrint(new SumDoublePrimitive(1000000000));
		taskTimer.measureAndPrint(new SumDouble(1000000000));
		taskTimer.measureAndPrint(new SumBigDecimal(1000000000));
		
		
	}

}
