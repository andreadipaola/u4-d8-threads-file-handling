package exercise_2;

public class CustomThread implements Runnable {
	private long partialSum;

	public long getPartialSum() {
		return partialSum;
	}

	@Override
	public void run() {
		for (int i = indexStart; i < indexEnd; i++) {
			partialSum += list.get(i);
		}
	}
}
