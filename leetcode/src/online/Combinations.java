package online;

import java.util.ArrayList;

public class Combinations {
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		if(n<=0||k<=0||n<k){
			return null;
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> subResult = new ArrayList<Integer>();
		int start=1;
		int current=0;
		buildResult(start, current,n,k, subResult,result);
		return result;
		
	}
	public void buildResult(int start,int current,int n,int k ,
			ArrayList<Integer> subResult, ArrayList<ArrayList<Integer>> result){
		if(current==k){
			ArrayList<Integer> temp = new ArrayList<Integer>(subResult);
			result.add(temp);
			return ;
		}
		for(int i=start;i<=n;i++){
			subResult.add(i);
			buildResult(i+1,current+1,n,k,subResult,result);
			subResult.remove(subResult.size()-1);
		}
		
	}


}
