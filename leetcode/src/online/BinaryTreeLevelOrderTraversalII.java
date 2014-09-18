package online;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeLevelOrderTraversalII {
	//分层遍历，从底部叶子节点开始返回。
	// 思路与一相同，只是再最后用一个stack 来操纵顺序使其从叶子节点到根节点。

	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		ArrayList<ArrayList<Integer>> finalRes = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<TreeNode>> res = new ArrayList<ArrayList<TreeNode>>();
		if (root == null) {
			return finalRes;
		}
		
		ArrayList<TreeNode> parent = new ArrayList<TreeNode>();
		ArrayList<TreeNode> current = new ArrayList<TreeNode>();
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

		Stack<ArrayList<Integer>> s = new Stack<ArrayList<Integer>>();
		for (ArrayList<TreeNode> arr : res) {
			ArrayList<Integer> intArr = new ArrayList<Integer>();
			for (TreeNode node : arr) {
				intArr.add(node.val);
			}
			s.push(intArr);

		}
		while (!s.isEmpty()) {
			finalRes.add(s.pop());
		}
		return finalRes;

	}
}
