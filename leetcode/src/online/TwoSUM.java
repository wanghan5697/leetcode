package online;

import java.util.HashMap;

public class TwoSUM {
	public int[] twoSum(int[] numbers, int target){
		if(numbers==null||numbers.length==0){
			return null;
		}
		if(numbers.length==1){
			return numbers;
		}
		int [] res = new int[2];
		HashMap<Integer,Integer> table = new HashMap<Integer, Integer>(); 
		for(int i=0;i<numbers.length;i++){
		     if(table.containsKey(target-numbers[i])){
		    	 res[0]=table.get(target-numbers[i])+1;
		    	 res[1]=i+1;
		    	 return res;
		     }
			
			table.put(i, numbers[i]);
			
		}
		return null;
	}

}
