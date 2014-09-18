package online;

public class SingleNumber {

	public int singleNumber(int[]A){
		if(A.length==0){
			return 0;
		}
		int res = A[0];
		for(int i=1;i<A.length;i++){
			res=res^A[i];
		}
		return res;
	}
	
	public static void main(String args []){
		int A[] = {1,1,2,2,4,4,3};
		System.out.println(new SingleNumber().singleNumber(A));
	}
}
