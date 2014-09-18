package online;

public class PathSum {

	public boolean hasPathSum(TreeNode root, int sum){
		return hasPath(root,0,sum);
	}
	public boolean hasPath(TreeNode root, int subSum, int sum ){
		if(root==null){
			return false;
		}
		subSum+=root.val;
		
		if(root.left==null&&root.right==null){
			   if(subSum==sum)
			return true;
			   else return false;
		}
		
		return hasPath(root.left,subSum,sum)||hasPath(root.right,subSum,sum);
		
	}
}
