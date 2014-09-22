package online;

import java.util.ArrayList;
import java.util.List;

public class ADefin {	
	
	    public ListNode sortList(ListNode head) {
	     if(head==null||head.next==null){
	    	 return head;
	     }
	     ListNode slow = head;
	     ListNode fast = head;
	     while (fast.next!=null&&fast.next.next!=null){
	          slow = slow.next;
	          fast = fast.next.next;
	     }
	     slow.next=fast;
	     slow.next=null;
	    slow = sortList(head);
	    fast = sortList(fast);
	     
	
	    	return merge(slow,fast);
	    }
	    
	    public ListNode merge(ListNode slow, ListNode fast){
	    	
	    	ListNode head = new ListNode(0);
	    	ListNode cur = head;
	    	while (slow!=null&&fast!=null){
	    		if (slow.val<fast.val){
	    			cur.next=slow;
	    			slow=slow.next;
	    		}
	    		else {
	    			cur.next=fast;
	    			fast=fast.next;
	    		}
	    		cur= cur.next;
	    	}
	    	if (slow!=null){
	    		cur.next=slow;
	    	}
	    	else if(fast!=null){
	    		cur.next=fast;
	    	}
	    	
	    
	    return head.next;
	    
	    
	    }
	    
	    
	    
	    


 
	 
	 /*
	public ListNode swapPairs(ListNode head) {
		if (head==null){
			return null;
		}
		ListNode p1 = head;
		ListNode p2 = head.next;
        while(p2.next!=null){
        	  p2.next.next=p1;
        	  p1.next=p2.next;
        	  p2=p2.next;
        	  p1=p1.next;
        	  
        }
		
		return p1;
	}
*/
	public static void main(String args[]) {
		
      int A[]={0,2,1,2,1,0,0,2,1,2,0,1};
      for(int i=0;i<A.length;i++)
      System.out.print(A[i]+"");
	}

}

class UndirectedGraphNode {
	int label;
	List<UndirectedGraphNode> neighbors;
	
	UndirectedGraphNode(int x){
		label=x;
		neighbors=new ArrayList<UndirectedGraphNode>();
		
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
	
}


class TreeLinkNode {
	      int val;
	     TreeLinkNode left, right, next;
	     TreeLinkNode(int x) {
	    	 val = x; }
}
class Interval{
	int start;
	int end;
	Interval(){
		start=0;
		end=0;
	}
	Interval(int s ,int e){
		start=s;
		end=e;
	}
}








