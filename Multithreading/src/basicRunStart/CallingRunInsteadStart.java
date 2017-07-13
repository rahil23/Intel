//there is no mutithreading in this Program becoz we havn't called start().

package basicRunStart;

public class CallingRunInsteadStart extends Thread {
public void run()
{
	for (int i = 0; i < 10; i++) {
	System.out.println("child thread");
}
}
public static void main(String[] args) {
	CallingRunInsteadStart obj = new CallingRunInsteadStart();
	obj.run();
	for (int i = 0; i < 10; i++) {
		System.out.println("main thread");
		
	}
}
}
