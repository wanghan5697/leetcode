package online;

public class UniqueBST {

	public int numTrees(int n){
		if (n==0||n==1){
			return 1;
		}
		
		int sum=0,left=0,right=0;
		for(int k=1;k<=n;k++){
			left= numTrees(k-1);
			right=numTrees(n-k);
			sum+=left*right;
		}
		
		return sum;	
	}
}
