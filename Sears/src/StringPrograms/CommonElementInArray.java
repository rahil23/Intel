package StringPrograms;

public class CommonElementInArray {
	public static void main(String[] args) {
		
		String s= "wefggthyrui";
		String s2= "qwerwtyujk";
		char c[] = s.toCharArray();
		char c2[] = s2.toCharArray();
		boolean isCommon=false;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if(c[i]==c2[j])
				{
					System.out.println(c[i]);
					isCommon=true;
				}
				
			}
			
		}
		
	}

}
