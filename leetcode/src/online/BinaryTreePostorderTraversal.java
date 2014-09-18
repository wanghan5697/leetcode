package online;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
//后序遍历
	//用两个stack， 一个s和一个output，s用来第一次放入节点，s弹出的节点放到output里来。
	//最后把output里的结果放到res 里面返回。
	public List<Integer> postorderTraversal(TreeNode root) {
		
		List<Integer> res = new LinkedList<Integer>();
        
		if(root==null){
			return res;
		}
		Stack<TreeNode> s = new Stack<TreeNode>();
		
		Stack<TreeNode> output = new Stack<TreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			TreeNode cur =s.pop();
			output.push(cur);
			
			if (cur.left!=null){
				s.push(cur.left);
			}
			if(cur.right!=null){
				s.push(cur.right);
			}
		
		}
		while(!output.isEmpty()){
			res.add(output.pop().val);
		}
		return res;
    }
}


 
