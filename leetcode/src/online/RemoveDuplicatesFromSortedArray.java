package online;

public class RemoveDuplicatesFromSortedArray {
	 public int removeDuplicates(int[] A) {
		 if(A.length<=1){
			 return A.length;
		 }
		 int slow =0,fast= 1; 
		 while(fast<A.length){
			 if(A[slow]==A[fast]){
				 fast++;
			 }
			 else {
				 slow++;
				 A[slow]=A[fast];
				 fast++;
			 }
			 
		 }
		 return slow+1;
		
	 }
}
