package online;

import java.util.ArrayList;

import java.util.Arrays;

public class Subsets {
	 public ArrayList<ArrayList<Integer>> subsets(int[] S) {
    
		 // Non-recursion 
	/*	 ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	    
		 if(S==null){
	    	 return res;
	     }
		 
		 Arrays.sort(S);//因为结果要求顺序排列，所以先sort
		 
	 
	     for(int i=0;i<S.length;i++){
			 ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			
			 //get sets that are already in result
			 for(ArrayList<Integer> a:res){
            	 temp.add(new ArrayList<Integer>(a));
             }
			//add S[i] to existing sets
             for(ArrayList<Integer> a :temp){
            	 a.add(S[i]);
             }
             
     		//add S[i] only as a set
             ArrayList<Integer> single = new ArrayList<Integer>();
             single.add(S[i]);
             temp.add(single);
             res.addAll(temp);
	     }
	     
	     //add empty set
	     res.add(new ArrayList<Integer>());
	     return res;

	    }
	 
	 */
	 
		 
		 // Recursion 
		 
		 if(S.length==0){
			 return null;
		 }
		 else return getSubsets(S, 0);
	
	 }
	 public ArrayList<ArrayList<Integer>> getSubsets(int[] S, int index){
		 ArrayList<ArrayList<Integer>> result; 
		
		 if(S.length==index){
			 result= new ArrayList<ArrayList<Integer>>(); 
			 result.add(new ArrayList<Integer>());   // Empty set
		 }
		 else {
			 result=getSubsets(S,index+1);
			 int item = S[index];
			 ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
			 for(ArrayList<Integer> subset :result){
				 ArrayList<Integer> newsubset= new ArrayList<Integer>();
				 newsubset.addAll(subset);
				 newsubset.add(item);
				 moresubsets.add(newsubset);	 
			 }
			result.addAll(moresubsets);
			
		 }
		 return result;

	 }
	 
	 public static void main(String args[]){
		 int[] s= {1,2,3,4};
		System.out.println (new Subsets().subsets(s));	 		 
	 }

}
