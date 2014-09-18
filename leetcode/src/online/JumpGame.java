package online;

public class JumpGame {
	public static boolean canJump(int[] A) {
		if(A==null||A.length==0){
			return false;
		}
		int reach =0;
		for(int i=0;i<=reach&&i<A.length;i++){
			reach=Math.max(A[i]+i, reach);
		}
		if(reach<A.length-1)
			return false;
		return true;

		/*if (A.length <= 1) {
			return true;
		}
		if (A[0] >= A.length - 1)
			return true;
		int maxLength = A[0];
		if (maxLength == 0)
			return false;
		
		for (int i = 1; i < A.length - 1; i++) {
			if (maxLength >= i && (i + A[i] >= A.length - 1)) {
				return true;
			}
			if (maxLength <= i + A[i] && A[i] == 0) {
				return false;
			}
			if (i + A[i] > maxLength) {
				maxLength = i + A[i];
			}

		}
		return false;
      */
	}

	public static void main(String[] args) {
		int[] A = { 2, 0, 0 }; // 特殊的case
		// int[] A = {2,3,1,1,4};
		// int[] A = {3,2,1,0,4};
		System.out.println(canJump(A));
	}
}
