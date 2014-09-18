package online;

import java.util.ArrayList;

public class Permutations {

	public ArrayList<ArrayList<Integer>> permute(int [] num){
		 ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();  
		    if(num == null || num.length==0)  
		        return res;  
		    ArrayList<Integer> first = new ArrayList<Integer>();  
		    first.add(num[0]);  
		    res.add(first);  
		    for(int i=1;i<num.length;i++)  
		    {  
		        ArrayList<ArrayList<Integer>> newRes = new ArrayList<ArrayList<Integer>>();  
		        for(int j=0;j<res.size();j++)  
		        {  
		            ArrayList<Integer> cur = res.get(j);  
		            for(int k=0;k<cur.size()+1;k++)  
		            {  
		                ArrayList<Integer> item = new ArrayList<Integer>(cur);  
		                item.add(k,num[i]);  
		                newRes.add(item);  
		            }  
		        }  
		        res = newRes;  
		    }  
		    return res;     
	}
}
