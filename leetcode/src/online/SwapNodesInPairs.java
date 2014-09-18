package online;

public class SwapNodesInPairs {
	
	public ListNode swapPairs(ListNode head) {
      if(head==null||head.next==null){
    	  return head;
      }
      ListNode fakeHead = new ListNode(-1);
      fakeHead.next=head;
      
      ListNode pre= fakeHead;
      ListNode cur= head;
      while(cur!=null&&cur.next!=null){
    	  ListNode nextStart = cur.next.next;
    	  cur.next.next=cur;
    	  pre.next=cur.next;
    	  cur.next=nextStart;
    	  pre=cur;
    	  cur=cur.next;
	  
      }
		return fakeHead.next;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	/*public ListNode swapPairs(ListNode head) {
		if(head==null){
			return null;
		}
		ListNode  helper = new ListNode(0);
		helper.next= head;
		ListNode pre = helper;
		ListNode cur = head;
		while(cur!=null&&cur.next!=null){
			ListNode next = cur.next.next;
			cur.next.next=cur;
			pre.next= cur.next;
			
			if(next!=null&&next.next!=null){
				cur.next=next.next;
			}
			else 
				cur.next=next;
			pre= cur;
			cur=next;
					
		}
				return helper.next;
*/
	}

}
