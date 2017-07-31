package abstractInterface;

class A
{
	public void fun()
	{
		System.out.println("A class Fun");
	}
}
class B
{
	public void fun()
	{
		System.out.println("B Class Fun");
	}
}

class MultipleInheritance extends A, B 
{
public static void main(String a[])
{
MultipleInheritance obj = new MultipleInheritance();
obj.fun();
}
}






