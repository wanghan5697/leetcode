package online;

public class EditDistance {
	 public int minDistance(String word1, String word2) {
	     int length1 = word1.length();
	     int length2 = word2.length();
	     if(length1==0||length2==0){
	    	 return length1==0?length2:length1;
	     }
	     int distance [][] = new int[length1+1][length2+1];
	     distance[0][0]=0;
	     
	     for(int i=1;i<=length1;i++){
	    	 distance[i][0]=i;
	    	
	     }
	     for(int j=1;j<=length2;j++){
	    	 distance[0][j]=j;
	     }
		 
	     for(int i=1;i<=length1;i++){
	    	 for(int j=1;j<=length2;j++){
	    		 if(word1.charAt(i-1)==word2.charAt(j-1)){
	    			 distance[i][j]=distance[i-1][j-1];
	    		 }
	    		 else {
	    			 distance[i][j] = Math.min(distance[i - 1][j - 1], Math.min(distance[i][j - 1], distance[i - 1][j])) + 1;  
	    		 }
	    	 }
	     }
	     return distance[length1][length2];
	 }

}
