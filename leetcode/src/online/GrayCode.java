package online;

import java.util.ArrayList;

public class GrayCode {

    public ArrayList<Integer> grayCode(int n) {
    	if(n==0){
    		 ArrayList<Integer> res = new ArrayList<Integer>();
    		 res.add(0);
    		 return res;
    	}
    	 ArrayList<Integer> temp = grayCode(n-1);
    	
    	 int addNumber = 1<<(n-1);
    	 ArrayList<Integer> result = new  ArrayList<Integer>(temp);
    	 for (int i=temp.size()-1;i>=0;i--){
    		 result.add(addNumber+temp.get(i));
    	 }
    	 return result;

    }
    public static void main(String args[]){
    	new GrayCode().grayCode(5);
    	
    }
}
