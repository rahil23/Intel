package Array;

public class oddEvenIndex {


	public static void main(String[] args) {
int a[] = {1,2,3,4,5,6,7,8,9,10};

int len = a.length-1;
int res[] = new int[a.length];
int eindex = 0;
int oindex=1;

for (int i = 0; i < len; i++) {
	if(a[i]%2==0)
	{
		res[eindex]=a[i];
		eindex+=2;
		
	}
	else
	{
		res[oindex]=a[i];
		oindex+=2;
		
	}
	
}
for (int i = 0; i < res.length-1; i++) {
	System.out.println(res[i]);
}
		
	}
}



