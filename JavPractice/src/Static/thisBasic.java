package Static;

public class thisBasic {
	public thisBasic() {
	System.out.println("Default consturctor");
	System.out.println(this);
	
	thisBasic obj2 = new thisBasic();
	System.out.println(obj2);
	
	
	}
	public static void main(String[] args) {
		
		thisBasic obj = new thisBasic();
		//System.out.println(obj);
		
	}

}
