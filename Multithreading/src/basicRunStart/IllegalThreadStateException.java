package basicRunStart;

public class IllegalThreadStateException extends Thread {

	public void run()
	{
		System.out.println("run thread");
	}
	
	public static void main(String[] args) {
		IllegalThreadStateException obj = new IllegalThreadStateException();
		obj.start();
		System.out.println("main thread");
		obj.start();
	}
}
