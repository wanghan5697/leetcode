package online;

import java.util.ArrayList;

public class UniqueBSTII {

	
	public ArrayList<TreeNode> generateTrees(int n) {
      
		return helper(1,n);
		
    }

	private ArrayList<TreeNode> helper(int left, int right){
		ArrayList<TreeNode> res= new ArrayList<TreeNode>();

		if(left>right){
			res.add(null);
			return res;
		}
		for(int i=left;i<=right;i++){
			ArrayList<TreeNode> leftSet = helper(left,i-1);
			ArrayList<TreeNode> rightSet= helper(i+1,right);
			
			for(int j=0;j<leftSet.size();j++){
				for(int k=0;k<rightSet.size();k++){
					TreeNode root = new TreeNode(i);
					root.left=leftSet.get(j);
					root.right=rightSet.get(k);
					res.add(root);
				}
			}
		}
		return res;
	}
}
