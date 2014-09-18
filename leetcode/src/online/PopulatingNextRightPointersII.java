package online;

public class PopulatingNextRightPointersII {

	 public void connect(TreeLinkNode root) {
	      if(root==null){
	    	  return;
	      }
	      TreeLinkNode point = root.next;
		 
	      while(point!=null){
	    	  if (point.left!=null){
	    		  point=point.left;
	    		  break;
	    	  }
	    	  else if (point.right!=null){
	    		  point=point.right;
	    		  break;
	    	  }
	    	  point=point.next;
	      }
		 if(root.right!=null){
			 root.right.next=point;
		 }
		 if(root.left!=null){
			 root.left.next=root.right==null?point:root.right;
		 }
		 
		 connect(root.left);
		 connect(root.right);
		 
	    }
}
