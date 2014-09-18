package online;

import java.util.ArrayList;

public class GenerateParentheses {

	public ArrayList<String> generateParenthesis(int n){
		ArrayList<String> res= new ArrayList<String>();
		if(n<=0){
			return null;
		}
		rec(n,n,"",res);
		return res;
	}
	public void rec(int left, int right, String str , ArrayList<String> res){
		if(left ==0&&right==0){
			res.add(str);
			return;
		}
		else if(left==0){
			rec(left,right-1,str+")", res);
			return;
		}
		else if(right==0){
			return;
		}
		else if(left>right){
			return ;
		}
		rec(left-1,right,str+"(",res);
		rec(left, right-1,str+")",res);
	}
	public static void main(String args[]){
		new GenerateParentheses().generateParenthesis(5);
	}
}
