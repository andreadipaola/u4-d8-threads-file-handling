package exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Random random = new Random();
		List<Integer> fullList = new ArrayList<Integer>(3000);

		for (int i = 0; i < 3000; i++) {
			int randomNumber = random.nextInt();
			fullList.add(randomNumber);
		}

		SplittedArray firstSplittedArray = new SplittedArray(fullList, 0, 1000);
		Thread t1 = new Thread(firstSplittedArray);
		SplittedArray secondSplittedArray = new SplittedArray(fullList, 1000, 2000);
		Thread t2 = new Thread(secondSplittedArray);
		SplittedArray tirdSplittedArray = new SplittedArray(fullList, 2000, 3000);
		Thread t3 = new Thread(tirdSplittedArray);

//		List<Integer> firstSplittedList = fullList.subList(0, 1000);
//		List<Integer> secondSplittedList = fullList.subList(1000, 2000);
//		List<Integer> tirdSplittedList = fullList.subList(2000, 3000);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
		}

		long totalSum = firstSplittedArray.getPartialSum() + secondSplittedArray.getPartialSum()
				+ tirdSplittedArray.getPartialSum();
		System.out.println("La somma totale è: " + totalSum);

	}

}
