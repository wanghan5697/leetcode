package online;

public class BSTfromInPostTraversal {
	// 通过inorder 和postorder 结果，创建BST
	// 主要是通过再inorder 和postorder 两个数组定位，用递归处理子节点。
	//关键要注意定位时候的数组位置的变化
	 public TreeNode buildTree(int[] inorder, int[] postorder) {
	        if(inorder.length!=postorder.length){
	        	return null;
	        }
	       int inorderStart=0, inorderEnd=inorder.length-1;
	       int postorderStart=0,postorderEnd=postorder.length-1;
	       return buildBST(inorder, inorderStart,inorderEnd,postorder,postorderStart,postorderEnd);	        
	    }
	 public TreeNode buildBST(int []inorder,int inorderStart,int inorderEnd,
			                    int[]postorder,int postorderStart,int postorderEnd){
		
		 if(inorderStart>inorderEnd||postorderStart>postorderEnd){
			 return null;
		 }
		 
		 TreeNode root = new TreeNode(postorder[0]);
		 int k=0;
		 for (int i=0;i<=inorderEnd;i++)
		 {
			 if(inorder[i]==root.val){
				 k=i;
				 break;
			 }
		 }
		 
		 root.left=buildBST(inorder, inorderStart,k-1,postorder,postorderStart,postorderStart+k-(inorderStart+1));
	     root.right=buildBST(inorder, k+1,inorderEnd,postorder,postorderStart+k-inorderStart,postorderEnd-1);
	        
         return root;  

	 }
     
}
