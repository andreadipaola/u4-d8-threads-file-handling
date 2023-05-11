package exercise_2;

import java.util.List;

class SplittedArray implements Runnable {

	private List<Integer> list;
	private int indexStart;
	private int indexEnd;
	private long partialSum;

	public SplittedArray(List<Integer> list, int indexStart, int indexEnd) {
		this.list = list;
		this.indexStart = indexStart;
		this.indexEnd = indexEnd;
	}

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
