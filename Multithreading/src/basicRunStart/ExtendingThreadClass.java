/*In this Program o/p is not Expected.. thread schedular can invoke main thread and child thread at runtime in 
Random ways. The o/p can be mix also
*/
package basicRunStart;

public class ExtendingThreadClass  extends Thread{

	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");	
		}
		
	}
	
	public static void main(String[] args) {
		ExtendingThreadClass obj = new ExtendingThreadClass();
		obj.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			
		}
	}
	
}
