package online;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	
	public List<Integer> inorderTraversal(TreeNode root){
		List<Integer> res = new ArrayList<Integer>();
		if(root ==null){
			return res;
			
		}
		Stack<TreeNode> stack= new Stack<TreeNode>();
		TreeNode cur = root;
		
	    while(true){
	    	while(cur!=null){
	    		stack.add(cur);
	    		cur=cur.left;
	    	}
	    	if(stack.isEmpty()){
	    		break;
	    	}
	    	cur = stack.pop();
	    	res.add(cur.val);
	    	cur = cur.right;
	    }
	    return res;
	}

}
