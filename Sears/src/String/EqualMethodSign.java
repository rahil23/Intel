package String;

public class EqualMethodSign {
	public static void main(String[] args) {
		String s1 = "Rahil";
		String s2= "Rahil";
		String s5="rahil";
		String s3 = new String("Rahil");
		String s4 = new String("Rahil");
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}

}
