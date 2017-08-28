package String;

public class StringBasic {
	
	public static void main(String[] args) {
		String a = new String("AAA");
		String b  = new String("AAB");
		System.out.println(a.toString()+" "+b);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		//
		String str = "new String";
		
		String str2 = "new String";
		String st3 = "new string";
		String g=null;
		String f;
		String nullstr = "";
		System.out.println(g.hashCode());
		String str4 =nullstr; 
	}

}
