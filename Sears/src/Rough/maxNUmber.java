package Rough;

public class maxNUmber {
	public static void main(String[] args) {
		String n[] ={"abc","wer","wrwrw","rwefefef","rw","eerewrewrfcdfgfrefdcsx"};
		String max = n[0];
		for(int i=0;i<n.length;i++)
		{
			if(n[i].length()>max.length())
			{
				max=n[i];
			}
			
		}
		System.out.println(max);
		
}
}
