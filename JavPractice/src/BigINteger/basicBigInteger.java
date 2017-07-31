package BigINteger;

import java.math.BigInteger;

public class basicBigInteger 
	{
	public static void main(String[] args) 
	{
	int a=25;
	int b=10;
	BigInteger A = BigInteger.valueOf(a);
	BigInteger B = BigInteger.valueOf(b);
	BigInteger add = A.add(B); 
	//ADDITION
	BigInteger sub = A.subtract(B); 
	//SUBTRACTION
	BigInteger multi = A.multiply(B); 
	//MULTIPLICATION
	BigInteger div = A.divide(B); //DIVISION

	System.out.println("Addition of A & B is : "+add);
	System.out.println("Subtraction of A & B is: "+sub);
	System.out.println("Multiplication of A & B is: "+multi);
	System.out.println("Multiplication of A & B is: "+div);
	}
	}


