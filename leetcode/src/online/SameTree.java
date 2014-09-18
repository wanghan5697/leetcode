package online;

public class SameTree {

	public boolean isSameTree(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return true;
		}
		if (t1 == null || t2 == null) {
			return false;
		}
		if (t1.val != t2.val) {
			return false;
		}

		boolean left = isSameTree(t1.left, t2.left);
		boolean right = isSameTree(t1.right, t2.right);

		return left && right;

	}

}
