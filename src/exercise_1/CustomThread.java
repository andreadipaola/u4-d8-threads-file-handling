package exercise_1;

class CustomThread extends Thread {

	private String symbol;

	public CustomThread(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "\t" + this.getName() + "\t" + this.symbol);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
