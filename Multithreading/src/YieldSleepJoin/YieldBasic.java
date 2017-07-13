package YieldSleepJoin;

public class YieldBasic extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run thread");
		Thread.yield();	
		}
		//super.run();
		}
	
	public static void main(String[] args) {
		YieldBasic obj = new YieldBasic();
		obj.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		Thread.yield();
		}
	
	}

}
