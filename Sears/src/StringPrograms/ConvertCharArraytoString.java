package StringPrograms;

public class ConvertCharArraytoString {
	public static void main(String[] args) {
		String str = "My Name is Khan";
		
		char arr[] = str.toCharArray();
		
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}*/
		String s= " ";
		String strarr[] = {"qwe","ert","tyu","asd","fgh"};
		for (int i = 0; i < strarr.length; i++) {
			s=s+strarr[i];
			}
		System.out.println(s);
	}

}
	