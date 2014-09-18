package online;

import java.util.ArrayList;
import java.util.Set;

public class WordBreakII {
	  public ArrayList<String> wordBreak(String s, Set<String> dict) {
	        ArrayList<String> res = new ArrayList<String>();
	        if(s==null||s.length()==0){
	        	return res;
	        }
	        int start =0;
	        helper(s,dict,start,"",res);
	        return res;
	    }
	  
	  private void helper(String s, Set<String> dict,int start,String item,  ArrayList<String> res){
		  if(start>s.length()){
			  res.add(item);
			  return;
		  }
		  StringBuilder sb = new StringBuilder();
		  for(int i=start;i<s.length();i++){
			  sb.append(s.charAt(i));
			  if(dict.contains(sb.toString()))
			  {
				  String newItem = item.length()>0?(item+""+sb.toString()):(sb.toString());
				  helper(s,dict,i+1,newItem,res);
			  }
		  }
	  }

}
