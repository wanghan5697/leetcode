package online;

public class ValidPalindrome {
	 public boolean isPalindrome(String s) {
		 if(s==null||s.length()==0){
			 return true;
		 }
	      int l = 0;
	      int r = s.length()-1;
	      while(l<r){
	    	  //判断标点符号，如果是标点符号，l++；
	    	  if(!isValid(s.charAt(l))){
	    		  l++;
	    		  continue;
	    	  }
	    	  //判断标点符号，如果是标点符号，r--；

	    	  if(!isValid(s.charAt(r))){
	    		  r--;
	    		  continue;
	    	  }
	    	  
	    	  if(isSame(s.charAt(l),s.charAt(r))){
	    		  return false;
	    	  }
	    	  l++;
	    	  r--;
	      }
	      return true;
	    }
	 
	 private boolean isValid(char c){
		 if(c>='a'&&c<='z'||c>='A'&&c<='Z' || c>='0' && c<='9'){
			 return true;
		 }
		 return false;
	 }
	 private boolean isSame(char c1, char c2){
		 if(c1>='A'&&c1<='Z')
			 c1=(char)(c1-'A'+'a');
		 if(c2>='A'&&c2<='Z')
			 c2=(char)(c2-'A'+'a');
		 return c1==c2;
	 }

}
