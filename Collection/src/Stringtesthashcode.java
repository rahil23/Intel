
public class Stringtesthashcode {

	public static void main(String[] args) {
		String s1 ="Sahil";
		String s2 = "Sahil";
	
		String s3 = new String("Sahil");
		String s4= new String("sahil");
	
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s3));
		
		/*System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());*/
	}
}
