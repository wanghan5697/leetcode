package online;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumII {
	 public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
		 ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	        if(num==null||num.length==0){
	        	return res;
	        }
	        Arrays.sort(num);
	        helper(num,0,target,new ArrayList<Integer>(),res);
	        return res;
	    }
	 public void helper(int[] num, int start, int target,ArrayList<Integer> item,
			 ArrayList<ArrayList<Integer>> res ){
		 if(target==0){
			 ArrayList<Integer> temp = new ArrayList<Integer>(item);
			 res.add(temp);
			 return ;
		 }
		 if(target<0||start>=num.length){
			 return ;
		 }
		 
		 for(int i=start;i<num.length;i++){
			 if(i>start&&num[i]==num[i-1])
				 continue;
			 item.add(num[i]);
			 helper(num,i+1,target-num[i],item,res);
			 item.remove(item.size()-1);
		 }
 
	 }

}
