package online;

public class RemoveDuplicatesFromSortedArrayII {

	public int removeDuplicates(int[] A) {
		if (A.length <= 2) {
			return A.length;
		}
		int slow = 0, fast = 1;
		int count = 0;


		for(;fast<A.length;fast++){
			if(A[fast]==A[slow]){
				if(count==0){
					A[++slow]=A[fast];
				}
				count++;
			}else {
				A[++slow]=A[fast];
				count=0;
			}
			
		}
		return slow+1;
	}
}
