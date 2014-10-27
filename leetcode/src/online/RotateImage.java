package online;

public class RotateImage {

	public void rotate(int [][] matrix){
		int n = matrix.length;
		int m= matrix[0].length;
		
		if (m!=n){
			return ;
		}
		
		//  a|b
		//  c|d
		
		for (int i = 0;i<n/2;i++){
			for(int j=0;j<Math.ceil(n/2.0);j++){				
				int temp = matrix [i][j];
				//c-->a
				matrix[i][j]=matrix[n-j-1][i];
				//d-->c
				matrix[n-1-j][i]=matrix[n-i-1][n-j-1];
				//b-->d
				matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
				//a-->b
				matrix[j][n-1-i]=temp;
				
			}			
		}
	
	}
}
