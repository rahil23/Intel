
public class Avoidingdupinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
  String[] ab= {"A", "B", "B", "F", "A"};
  
   for(int i=0; i<ab.length;i++){
	   for(int j=0;j<ab.length;j++){
		   if(ab[i]==ab[j]){
			   count++;
			   
			   if(count==2){
				   System.out.println(ab[i]);
				  count= --count-1;
				   
			   }
			   
		   }
	   }
   }
	}

}
