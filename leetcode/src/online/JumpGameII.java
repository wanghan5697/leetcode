package online;

public class JumpGameII {
	  public int jump(int[] A) {
		if(A==null||A.length==0){
			return 0;
		}
		int lastReach=0;
		int reach=0;
		int step =0;
		for(int i=0;i<=reach&&i<A.length;i++){
			if(i>lastReach)
			{
				step++;
				lastReach=reach;
			}
			reach=Math.max(A[i]+i, reach);
		}
		if(reach<A.length-1)
			return 0;
		return step;
	        
	    }

}
