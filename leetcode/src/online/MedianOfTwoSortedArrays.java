package online;

public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int A[], int B[]) {

		int m=A.length;
		int n=B.length;
		int total=m+n;
		if(total%2!=0){    //if it is odd number
			return findKth(A,0,m-1,B,0,n-1,total/2+1);
		}
		else {
			double x = findKth(A,0,m-1,B,0,n-1,total/2);
			double y =findKth(A,0,m-1,B,0,n-1,total/2+1);
			return (x+y)/2;
		}
		
	}

	private int findKth(int[] A,int astart,int aend,int[] B,int bstart,int bend,int k){
		int m=aend-astart+1;
		int n=bend-bstart+1;
		if(m>n){
			return findKth(B,bstart,bend,A,astart,aend,k);
		}
		if(m==0)
			return B[k-1];
		if(k==1)
			return Math.min(A[astart], B[bstart]);
		
		int partA=Math.min(k/2, m);
		int partB=k-partA;
		
		if(A[astart+partA-1]<B[bstart+partB-1]){
			return findKth(A,astart+partA,aend,B,bstart,bend,k-partA);
		}
		else if(A[astart+partA-1]>B[bstart+partB-1])
			return findKth(A,astart,aend,B,bstart+partB,bend,k-partB);
		else 
			return A[astart+partA-1];
		
	}
	public static void main(String args[]){
		int A[]={1,3,5,7,9};
		int B[]={2,4,6,8,10,20,22,25,37,42};
		System.out.println(new MedianOfTwoSortedArrays().findMedianSortedArrays(A,B));
	}
}
