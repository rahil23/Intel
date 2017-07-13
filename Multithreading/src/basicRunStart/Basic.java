package basicRunStart;

public class Basic extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("run thread");
		}
	//	super.run();
	}
	public static void main(String[] args) {
		
	}

}
