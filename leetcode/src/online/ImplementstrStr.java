package online;

public class ImplementstrStr {
	//brute force
	//O((n-m+1)*m)=O(n*m)
	 public String strStr(String haystack, String needle) {
		 if(haystack==null||needle==null||needle.length()==0){
	            return haystack;
	        }
	       
	        if(needle.length()>haystack.length()){
	            return null;
	        }
	        for(int i=0;i<=haystack.length()-needle.length();i++){
	            boolean success=true;
	            for(int j=0;j<needle.length();j++){
	                if(haystack.charAt(i+j)==needle.charAt(j)){
	                    continue;
	                }
	                else 
	                {
	                    success=false;
	                    break;
	                }
	                
	            }
	            if(success){
	                    return haystack.substring(i);
	                }
	        }
	        return null;
	        
	    }

}
