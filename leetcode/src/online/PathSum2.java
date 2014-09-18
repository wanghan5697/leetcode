package online;

import java.util.ArrayList;

public class PathSum2 {

	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

		if(root==null){
			return res;
		}
        ArrayList<Integer> item = new ArrayList<Integer>();

		item.add(root.val);
		pathSum2(root,sum-root.val,item,res);
	    return res;

	}

	public void pathSum2(TreeNode root,int sum,ArrayList<Integer> item,ArrayList<ArrayList<Integer>> res) {
	
         if(root==null){
        	 return ;
         }
         if(root.left==null&&root.right==null&&sum==0){
        	 res.add(new ArrayList<Integer>(item));
        	 return;
         }
         if(root.left!=null){
        	 item.add(root.left.val);
        	 pathSum2(root.left,sum-root.left.val,item,res);
        	 item.remove(item.size()-1);
        	 
         }
         if(root.right!=null){
        	 item.add(root.right.val);
        	 pathSum2(root.right,sum-root.right.val,item,res);
        	 item.remove(item.size()-1);
         }     
	}

}
