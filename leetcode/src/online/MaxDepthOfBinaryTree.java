package online;

public class MaxDepthOfBinaryTree {

	public int maxDepth(TreeNode root){
		
		if(root==null)
		{
			return 0;
		}
		int leftHeight=maxDepth(root.left);
		int rightHeight = maxDepth(root.right);
		return Math.max(leftHeight, rightHeight);
	}

	
	
}


 