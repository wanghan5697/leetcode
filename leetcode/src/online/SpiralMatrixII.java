package online;

public class SpiralMatrixII {
	 public int[][] generateMatrix(int n) {
		    int matrix[][]= new int[n][n];

		 if(n<=0){
	    	return matrix;
	    }
	    
	    int value=1;
	    int x=0,y=0;
	    
	    
	  for(int i=n;i>0;i-=2){
		  if(i==1){
			  matrix[x][y]=value;
		  }
		  else {
	    		
	    	for(int j=0;j<i-1;j++){
	    		matrix[x][y++]=value++;
	    	
	    	}
	    	for(int j=0;j<i-1;j++){
	    		matrix[x++][y]=value++;
	    		
	    	}
	    	for(int j=0;j<i-1;j--){
	    		matrix[x][y--]=value++;
	    	}
	    	for(int j=0;j<i-1;j--){
	    		matrix[x--][y]=value++;
	    	}
	    	x++;
	    	y++;	
	    }
	 }
	  return matrix;
	 }

}
