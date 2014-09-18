package online;

import java.util.*;

public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root){
		
		List<Integer> res = new ArrayList<Integer>();
		if (root==null){
			return res;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		TreeNode cur = root;
		
		while(!stack.isEmpty()){
			cur = stack.pop();
			
			res.add(cur.val);
			
			if(cur.right!=null){
				stack.push(cur.right);
			}
			if(cur.left!=null){
				stack.push(cur.left);
			}
			
		}
		return res;
	}
}
