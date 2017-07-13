package Static;

public class StaticBlock {

	static int a = 10;

	{
		System.out.println("THis is Initializer block. THis is invoke whenever constructor is called");
	}
	public StaticBlock() {
		this(a);
	System.out.println("This is Default constiurctor"+a);
	}
	
	public StaticBlock(int a)
	{ super();
		System.out.println("this is pramerterized constructor"+a);
	}
	public String nonStaticMethod()
	{
		System.out.println("nonStaticMethod");
		return "hi";
	}
	
static
{
	System.out.println("This is Static Block");
}
	public static void main(String[] args) {
		
		StaticBlock obj1 = new StaticBlock();
		StaticBlock obj2 = new StaticBlock();
		StaticBlock obj3 = new StaticBlock(10);
		
		obj2.nonStaticMethod();
	
		
	}
}
