package Static;

public class Overriding {

	public void f1()
	{
		System.out.println("method of baseclass");
	}
}

 class Derived extends Overriding
{
	public void f1()
	{
		System.out.println("method of child class");
	}
	
	public static void main(String[] args) {
		Derived d = new Derived();
		d.f1();
	}
}
