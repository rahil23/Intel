package Functions;

public class Mix {
	public static void main(String[] args) {
		String s1 = "Hi H a4m Hompiler";
		
		
		System.out.println(s1.charAt(10));
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.startsWith("C"));
		System.out.println(s1.startsWith("H",3));
		
		System.out.println(s1.indexOf('H'));
		System.out.println(s1.indexOf("am"));
		
		System.out.println(s1.indexOf('H',0));  // this method starts searching with the index position which is mentioned
		
		System.out.println(s1.lastIndexOf('H'));
		System.out.println(s1.lastIndexOf("am"));
		System.out.println(s1.matches("am"));//false
		
		System.out.println(s1.replace(' ', '$'));
		System.out.println(s1.replace("am", "$$"));
		
		//System.out.println(s1.replaceAll("[0-9]", "$"));
		
		//System.out.println(s1.replaceFirst(regex, replacement));
		
		System.out.println(s1.substring(1));
		
		System.out.println(s1.substring(1, 6)); 
		System.out.println(s1.compareToIgnoreCase("HI H A4M HOMPILER"));
		//System.out.println(s1.equalsIgnoreCase("HI H A4M HOMPILER"));
		
		//System.out.println(s1.);
		
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	
	System.out.println(s1.getClass());
	
	System.out.println(s1.split(" "));
		
		

}
}