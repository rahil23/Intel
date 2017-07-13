package basicRunStart;

public class OverridingStartMethod extends Thread {

	public void start()
	{
		System.out.println("start line");
	}
	public void run()
	{
		System.out.println("Run thread");
	}
	
	public static void main(String[] args) {
		OverridingStartMethod obj = new OverridingStartMethod();
		obj.start();
		System.out.println("main thread");
	}
}
