package online;

public class PalindromeNumber {
	
	//  如果x＝0， 返回true;
	//  如果x＝负数, 返回false;
	//  从第一位 和最后一位对比着找，如果第一位和最后以为相等，前指针向后挪一位，后指针向前挪一位。
	//  要注意每一位的值如何通过除法 和取余能够获得的。
	 public boolean isPalindrome(int x) {
	        if(x<0){
	        	return false;
	        }
	        if(x==0){
	        	return true;
	        }
	        int div=1 ;
	        
	        //
	        while(x/div>10){
	        	div*=10;
	        }
	        while (x!=0){
	        	int l= x/div;
	        	int r= x%10;
	        	if(l!=r){
	        		return false;
	        	}
	        	x=(x%div)/10;
	        	div/=100;
	        	
	        }
	        return true;
	        
	    }
}
