package Functions;

public class ObjectEqual {
	public static void main(String[] args) {
		String s1 = "My Name is Khan";
		String s2 = "My Name is Khan";
		String s3 = new String("My Name is Khan");
		String s4 = new String("My name is Khan");
		
		
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		System.out.println("Checking s1 and s2 String using = : "+ s1==s2);
		
		System.out.println("Checking s1 and s3 using =  "+s1==s3);
		
		System.out.println("Checking s2 and s4 using = "+ s2==s4);
		
		System.out.println("Checking s3 and s4 using = "+ s3==s4);
		
		System.out.println(s1.compareTo(s2));
		
		
		
		
	}

}
