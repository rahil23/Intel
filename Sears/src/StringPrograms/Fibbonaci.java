package StringPrograms;

public class Fibbonaci {
	public static void main(String[] args) {
		int s1 = 0;
		int s2=1;
		int s3;
		for (int i = 0; i < 20; i++) {
			s3=s1+s2;
			System.out.println(s3);
			s1=s2;
			s2=s3;
		}
		
	}

}
