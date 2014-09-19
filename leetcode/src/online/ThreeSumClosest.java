package online;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] num, int target) {
		if(num==null||num.length<3){
			return 0;
		}
		int min=Integer.MAX_VALUE;
		int val=0;
		Arrays.sort(num);
		for(int i=0;i<=num.length;i++){
			int low=i+1;
			int high=num.length-1;
			while(low<high){
				int sum=num[i]+num[low]+num[high];
				if(Math.abs(target-sum)<min){
					min=Math.abs(target-sum);
					val=sum;
				}
				 if(sum==target){
					return val;
				}
				 else if(target>sum){
					 low++;
				 }
				 else {
					 high--;
				 }			
			}
		}
		return val;
	}

}
