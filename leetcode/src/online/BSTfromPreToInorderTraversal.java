package online;

public class BSTfromPreToInorderTraversal {

	// 通过preorder 和inorder 的数组来创建对应的BST，同理需要注意两个数组各部分的定位。
	//递归处理子节点
	//返回根节点。
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder.length != inorder.length) {
			return null;
		}
		int preorderStart = 0, preorderEnd = preorder.length - 1;
		int inorderStart = 0, inorderEnd = inorder.length - 1;
		return buildBST(preorder, preorderStart, preorderEnd, inorder,
				inorderStart, inorderEnd);

	}

	public TreeNode buildBST(int[] preorder, int preorderStart,
			int preorderEnd, int[] inorder, int inorderStart, int inorderEnd) {
		if(preorderStart>preorderEnd||inorderStart>inorderEnd){
			return null;
		}
		TreeNode root = new TreeNode(preorder[0]);
		int k =0;
		
		for(int i=inorderStart;i<inorderEnd;i++){
			if(inorder[i]==preorder[0]){
				k=i;
				break;
			}
		}
		int leftSideLen=k-inorderStart;
		root.left=buildBST(preorder,preorderStart+1,preorderStart+leftSideLen,inorder,inorderStart,k-1);
		root.right=buildBST(preorder,preorderStart+leftSideLen,preorderEnd,inorder,k+1,inorderEnd);
		return root;

	}
	public static void main(String args[]){
		int[] inorder={4,2,5,1,6,3,7};
		int[] preorder={1,2,3,4,5,6,7};
		new BSTfromPreToInorderTraversal().buildTree(preorder,inorder);
	}

}
