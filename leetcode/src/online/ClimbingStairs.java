package online;

public class ClimbingStairs {
	//一位动态规划， 很重要的思想，利用递归
	// 创建一个ways的数组来存可能的结果。
	public int climbStairs(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		if(n==2){
			return 2;
		}
		int ways[]= new int[n+1];
		ways[0]=0;
		ways[1]=1;
		ways[2]=2;
		for(int i=3;i<=n;i++){
			ways[i]=ways[i-1]+ways[i-2];
		}
		return ways[n];
	}

}
