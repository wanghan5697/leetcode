package online;

public class PopulatingNextRightPointers {

	public void connect(TreeLinkNode root){
		
          if(root==null||(root.left==null&&root.right==null)){
        	  return; 
          }
		  if(root.left!=null&&root.right!=null){
			  root.left.next=root.right;
		  }
		  if(root.right!=null&&root.next!=null){
			  root.right.next=root.next.left;
		  }
		  if(root.right!=null){
			  root.right.next=null;
		  }
		  
		  connect(root.left);
		  connect(root.right);
	}
}




