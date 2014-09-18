package online;

import java.util.Stack;
/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
   The brackets must close in the correct order, "()" and "()[]{}" are all valid 
   but "(]" and "([)]" are not.
 */

public class ValidParentheses {
	 public boolean isValid(String s) {
		 if(s==null){
			 return false;
		 }
	       
		 Stack<Character> stack = new Stack<Character>();
		 
		 for(int i=0;i<s.length();i++){
			  
			 char c = s.charAt(i);   //遍历这个string的每一个字符
			 
			 if(c=='('||c=='['||c=='{'){
				 stack.push(c);
			 }
			 else if(c==')'||c==']'||c=='}'){
				 if(stack.size()==0){
					 return false;
				 } 
				 char cpop=stack.pop();
				 
				 if(cpop=='('&&c==')'){
					 continue;
				 }else if (cpop=='['&&c==']'){
					continue; 
				 }else if (cpop=='{'&&c=='}'){
					 continue;
				 }
				 return false;
				 
			 }
		 }
		 return stack.size()==0;	 
	    }
	 
	 public static void main (String args[]){
		 String s="({})[()]";
		boolean result= new ValidParentheses().isValid(s);
		System.out.println(result);
	 }
}
