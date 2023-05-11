package exercise_1;

public class Main {

	public static void main(String[] args) {

		CustomThread firstThread = new CustomThread("*");
		CustomThread secondThread = new CustomThread("#");

		firstThread.setName("First Thread");
		secondThread.setName("Second Thread");

		firstThread.start();
		try {
			firstThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		secondThread.start();
	}
}
