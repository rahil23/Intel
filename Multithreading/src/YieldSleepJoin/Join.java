package YieldSleepJoin;

public class Join {
	public static void main(String[] args) throws InterruptedException {
		MainThread obj = new MainThread();
		MainThread obj2 = new MainThread();
		obj.start();
		obj.interrupt();

		obj.join();
		obj2.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");

		}
	}

}

class MainThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("child Thread"+Thread.currentThread());
		}
	}

}
