
public class Printdistictele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count= 0;
  String[] ab= {"A", "G", "K", "A", "H", "G"};
  
  for(int i=0; i<ab.length;i++){
	  for(int j=0;j<ab.length;j++){
		  if(ab[i]==ab[j]){
			  count++;
			  
			  if(count==1){
				  System.out.println(ab[i]);
				  
			  }
		  }
	  }
  }
	}

}
