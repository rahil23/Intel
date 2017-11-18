package Functions;

public class CompareContents {
	public static void main(String[] args) {
		String alpha = "11";
		String alpha2 = "11";
		String alpha3 = new String("11");
		String smallAlpha= "10";
		String Lalpha="13";
		
		
		System.out.println(alpha.hashCode());
		System.out.println(alpha2.hashCode());
		System.out.println(alpha3.hashCode());
		
		System.out.println("compare alpha and alpha2 : " +alpha.compareTo(alpha2));
		System.out.println("COmpare aplha2 and alpha3 : "+alpha2.compareTo(alpha3));
		System.out.println("Compare alpha with small Aplha"+alpha.compareTo(smallAlpha));
		System.out.println("Compare alpha with large alpha"+alpha.compareTo(Lalpha));
		
		System.out.println(alpha.trim().length());
		
		System.out.println(alpha.contentEquals(alpha2)); //--> contentEquals is same as contains
		
		
	}

}
