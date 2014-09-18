package online;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {

		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

		if (root == null) {
			return res;
		}

        if(root.left==null&&root.right==null){
            res.add(new ArrayList<Integer>(root.val));
            return res;
        }
		Stack<TreeNode> parent = new Stack<TreeNode>();
		Stack<TreeNode> current = new Stack<TreeNode>();
		parent.push(root);
		boolean normalOrder = true;

		while (!parent.isEmpty()) {
			ArrayList<Integer> level = new ArrayList<Integer>();
			while (!parent.isEmpty()) {
				TreeNode cur = parent.pop();
				level.add(cur.val);
				if (normalOrder) {
					if (cur.left != null) {
						current.push(cur.left);
					}
					if (cur.right != null) {
						current.push(cur.right);
					} 
				}else {
						if (cur.right != null) {
							current.push(cur.right);

						}
						if (cur.left != null) {
							current.push(cur.left);
						}
					}

				}
			
				res.add(level);
				parent = current;
				current = new Stack<TreeNode>();
				normalOrder = !normalOrder;
		}
		return res;
	}

}
