
public class Findingduplicat {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {2,3,4,2,89,3,4, 6,9};
   
   
   dublicate(a);
	}
private static void dublicate(int a[]){
	int k=0;
	for(int i=0;i<7;i++){
		 int n=a[i];
		 
		 for(int j=0; j<7;j++){
			 if(n==a[j]){
				 k++;
				 if(k==2){
					 System.out.println(n);
					 k= --k -1;
				 }
			 }
		 }
	}
	
}
}
