package online;

public class TrappingRainWater {
    public int trap(int[] A) {
        if(A.length==0){
        	return 0;
        }
        int [] left = new int[A.length];
        int [] right = new int[A.length];
        left[0]=A[0];
        for(int i=1;i<A.length;i++){
        	left[i]=Math.max(left[i-1], A[i]);
        }
        right[A.length-1]=A[A.length-1];
        for(int i=A.length-2;i>=0;i--){
        	right[i]=Math.max(right[i+1], A[i]);
        }
        int sum =0 ;
        for(int i=1;i<A.length-1;i++){
        	sum+=Math.min(left[i], right[i]-A[i]);
        }
        return sum;
    }

}
