package abstractInterface;

public interface NewInterface {

	default void  fun()
	{
		System.out.println("fun of interface1");
	}
}
	interface NewInterface2
	{
		default void fun()
		{
			System.out.println("fun of interface2");
		}
	}
	
	class MainInterface implements NewInterface,NewInterface2
	{

	
		public  void fun() {
			// TODO Auto-generated method stub
			NewInterface.super.fun();
			NewInterface2.super.fun();
			
		}
		public static void main(String[] args) {
			MainInterface obj = new MainInterface();
			obj.fun();
		
			}
		
		}
		
	