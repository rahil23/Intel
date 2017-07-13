package StringPrograms;



public class replaceVowelWithoutreplace {

	public static void main(String[] args) {
		
	
	String str="qwewtasoiovujenkf";
	
	char a[] = str.toCharArray();
	
	String str2 = "";
	
for (int i = 0; i < a.length; i++) {
	
	if(a[i]=='a'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='e')
	{
		str = str+a[i];
	}
	System.out.println(str);
}
	
}

}
