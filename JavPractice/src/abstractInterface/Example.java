package abstractInterface;

 interface Example
 {
	 int i=1;
	 public static final int j=2;
	 
	 static void f1(){
		 System.out.println("Value of j is"+j);
	 }
	 default void f2()
	 {
		 System.out.println("Value of i is"+i);
	 }
	 
	 //Example ex = new Example(); // Can't instantiate Interface
	 
  }
 class Abc implements Example
{
	public static void main(String[] args) {
		Abc obj = new Abc();
		obj.f2();
		System.out.println(Abc.i);
		System.out.println(Abc.j);
	}
}