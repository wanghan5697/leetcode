package online;

import java.util.ArrayList;

public class PalindromePartitioning {
	
	public ArrayList<ArrayList<String>> partition(String s) {
		if(s.length()==0||s==null){
			return null;
	}
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		ArrayList<String> item= new ArrayList<String>();
		helper(s,0,item,res);
		return res;
	}
	private void helper(String s,int start,ArrayList<String> item,ArrayList<ArrayList<String>> res){
		if(start==s.length()){
			res.add(new ArrayList<String>(item));
			return;
		}
		for(int i=start;i<s.length();i++){
			String str = s.substring(start,i+1);
			if(isPalindrome(str)){
				item.add(str);
				helper(s,i+1,item,res);
				item.remove(item.size()-1);
			}
		}
	}
	public boolean isPalindrome(String s){
		int low=0;
		int high=s.length()-1;
		while(low<high){
			if(s.charAt(low)!=s.charAt(high)){
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
  /* public ArrayList<ArrayList<String>> partition(String s) {
        
	   ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        if(s==null||s.length()==0){
        	return result;
        }
        ArrayList<String> partition = new ArrayList<String>();
        helper(s,getDict(s),0,partition,result);
        return result;

    }
   private void helper(String s, boolean [][]dict,int start,ArrayList<String> partition,ArrayList<ArrayList<String>> result){
	   if(start==s.length()){
		   ArrayList<String> temp = new ArrayList<String>(partition);
		   result.add(temp);
		   return;
	   }
	   for(int i=start;i<s.length();i++){
		  if(dict[start][i]){
			  partition.add(s.substring(start,i+1));
			  helper(s,dict,i+1,partition,result);
			  partition.remove(partition.size()-1);
			  
		  }
	   }
	   
   }

	private boolean[][] getDict(String str){
	   boolean[][] dict= new boolean [str.length()][str.length()];
	   for(int i = str.length()-1;i>=0;i--){
		   for(int j=i;j<str.length();j++){
			   if(str.charAt(i)==str.charAt(j)&& ((j-i<2)||dict[i+1][j-1])){
				   dict[i][j]=true;
			   }
		   }
	   }
	   return dict;

   }*/

}
