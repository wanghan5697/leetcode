package online;

public class SearchforARange {
    public int[] searchRange(int[] A, int target) {
    	
         if(A==null){
        	return null;
        }
         int pos= find(A,0,A.length-1,target);
         if(pos==-1){
        	 return new int[]{-1,-1};
         }
         int start=0;
         int end =A.length-1;
         for(int i=pos-1;i>=0;i--){
        	 if(A[i]!=target){
        		 start=i+1;
        		 break;
        	 }
         }
         for(int i=pos+1;i<=end;i++){
        	 if(A[i]!=target){
        		 end = i-1;
        		 break;
        	 }
         }
         return new int[]{start,end};
  
     }

    public int find(int[]A, int start,int end,int target){
        if(start>end){
        	return -1;
        }
        int mid= (start+end)/2;
        if(A[mid]==target){
        	return mid;
        }
        else if (A[mid]<target){
         return	find(A,mid+1,end,target);
        }
        else 
        	return find(A,start,mid-1,target);
    }

}
