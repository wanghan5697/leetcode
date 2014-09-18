package online;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
	//分层遍历二叉树

     //用parent 和current 来记录相邻两层的状态。把current层的内容放到res结果集合里。调整parent 的指针指向current
	 //然后current 再new一个新的list出来。
	//便利parent 中的元素，如果有left或者right 就把他放到current里面储备。
	//直到current里的元素为空为止
	//便利res里面的对象，把结果放到一个finalRes的integer 的list 里面，返回。
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		
		ArrayList<ArrayList<Integer>> finalRes = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<TreeNode>> res = new ArrayList<ArrayList<TreeNode>>();//临时结果

		ArrayList<TreeNode> parent = new ArrayList<TreeNode>();;//记录上一层
		ArrayList<TreeNode> current = new ArrayList<TreeNode>();//记录当前层

		if (root == null) {
			return finalRes;
		}
		
		current.add(root);
		
		while (current.size() > 0) {
			res.add(current);
			parent = current;
			current = new ArrayList<TreeNode>();

			for (TreeNode node : parent) {
				if (node.left != null) {
					current.add(node.left);
				}
				if (node.right != null) {
					current.add(node.right);
				}
			}

		}

		for (ArrayList<TreeNode> arr : res) {
			ArrayList<Integer> intArr = new ArrayList<Integer>();
			for (TreeNode node : arr) {
				intArr.add(node.val);
			}
			finalRes.add(intArr);
		}
		return finalRes;
	}
	public static void main(String args[]){
		TreeNode root = new TreeNode (1);
		root.left= new TreeNode(2);
		new BinaryTreeLevelOrderTraversal().levelOrder(root);
	}
}
