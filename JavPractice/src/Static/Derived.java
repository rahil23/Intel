package Static;
 
class OverRiding {
	 

	public void f1()
	{
		System.out.println("method of baseclass");
	}
}

 class Derived extends OverRiding
{
	public void f1()
	{
		System.out.println("method of child class");
	}
	
	public static void main(String[] args) {
		Derived d = new Derived();
		d.f1();
		
		OverRiding obj = new Derived();
		obj.f1();
	}
}
