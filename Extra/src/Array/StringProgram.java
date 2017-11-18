package Array;

public class StringProgram {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ab= "sudeep";
int right= ab.length()-1;
int left= 0;
char cd[]= ab.toCharArray();

for(left=0;left<right; left++, right-- ){
char	temp= cd[right];
cd[right]= cd[left];
cd[left]= temp;


}
for(char c: cd){
	System.out.println(c);
	
}
	}

}


