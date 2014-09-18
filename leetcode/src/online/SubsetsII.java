package online;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsII {
/*
	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        if(num==null){
        	return null;
        }
        Arrays.sort(num);
        ArrayList<Integer> lastSize = new ArrayList<Integer>();
        lastSize.add(0);
        return helper(num,num.length-1,lastSize);
		
    }

	public ArrayList<ArrayList<Integer>> helper(int[] num,int index,ArrayList<Integer> lastSize){
		
           if(index==-1){
        	   ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        	   ArrayList<Integer> elem= new ArrayList<Integer>();
        	   res.add(elem);
        	   return res;
           }
           ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
           
           int size= res.size();
           int start =0;
           if(index>0&&num[index]==num[index-1])
        	   start=lastSize.get(0);
           for(int i=start;i<size;i++){
        	   ArrayList<Integer> elem = new ArrayList<Integer>();
        	   elem.add(num[index]);
        	   res.add(elem);
           }
           lastSize.set(0, size);
           return res;

}*/
	
	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
		ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();
		res.add(new ArrayList<Integer>());
		if(num==null||num.length==0){
			return res;
		}
		Arrays.sort(num);
		int start =0;
	
		for(int i=0;i<num.length;i++){
			int size= res.size();
		
			for(int j=start;j<size;j++){
				ArrayList<Integer> newItem= new ArrayList<Integer>(res.get(j));
				newItem.add(num[i]);
				res.add(newItem);

			}
			if(i<num.length-1&&num[i]==num[i+1]){
				start = size;
			}
			else 
				start =0;

		}

		return res;
		
	}

	
	
}
