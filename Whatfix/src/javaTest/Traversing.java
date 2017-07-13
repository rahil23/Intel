

//Robot Problem 4*4 traversing
package javaTest;

public class Traversing {
	

		 public int count(int [][] arrA, int row, int col){
		        
		        if(row==arrA.length-1 || col==arrA.length-1){
		            return 1;
		        }
		        return count(arrA, row+1, col) + count(arrA, row, col+1);
		    }

		    public int countDP(int [][] arrA){
		        int result [][] = new int[arrA.length][arrA.length];

		       
		        result[0][0] = 1;

		       		        for (int i = 0; i <result.length ; i++) {
		            result[0][i] = 1;
		        }

		       
		        for (int i = 0; i <result.length ; i++) {
		            result[i][0] = 1;
		        }

		        for (int i = 1; i <result.length ; i++) {
		            for (int j = 1; j <result.length ; j++) {
		                result[i][j] = result[i-1][j] + result[i][j-1];
		            }
		        }

		        return result[arrA.length-1][arrA.length-1];
		    }

		    public static void main(String[] args) {
		        int arrA [][] = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		        Traversing noOfPaths = new Traversing();
		        System.out.println("No Of Path (Recursion):- " +noOfPaths.count(arrA,0,0));
		        System.out.println("No Of Path (DP):- " +noOfPaths.countDP(arrA));
		    }
	}


