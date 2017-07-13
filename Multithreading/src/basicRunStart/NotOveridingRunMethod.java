//In this we have not overrided run method to no o/p

package basicRunStart;

public class NotOveridingRunMethod extends Thread {
	
	public void r()
	{
		for (int i = 0; i < 10; i++) {
				System.out.println("Child Method Thread");
		run();
		
	}
	}

	public static void main(String[] args) {
		NotOveridingRunMethod obj = new NotOveridingRunMethod();
		obj.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
			
		}
		
		
				
	}
}
