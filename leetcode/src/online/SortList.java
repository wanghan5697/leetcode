package online;

public class SortList {
 public ListNode sortList(ListNode head) {
     
    	if(head==null||head.next==null){
    		return head;
    	}
    	ListNode slow = head;
    	ListNode fast = head;
    	ListNode firstHalf = head;
    	while(fast.next!=null&&fast.next.next!=null){
    		slow = slow.next;
    		fast = fast.next.next;		
    	}
    	
    	ListNode secondHalf = slow.next;
        slow.next=null;
        ListNode leftList,rightList;
        leftList=sortList(firstHalf);
        rightList= sortList(secondHalf);
        
        return merge(leftList,rightList);
    }
    
    private ListNode merge(ListNode leftList,ListNode rightList){
    	if(leftList==null) return rightList;
    	if(rightList==null) return leftList;
    	ListNode fakeNode = new ListNode(-1);
    	ListNode ptr = fakeNode;
    	while(rightList!=null&&leftList!=null){
    		if(rightList.val<leftList.val){
    			ptr.next=rightList;
    			ptr=ptr.next;
    			rightList = rightList.next;
    		}
    		else {
    			ptr.next= leftList;
    			ptr=ptr.next;
    			leftList= leftList.next;
    		}
    	}
    	if(rightList!=null){
    		ptr.next= rightList;
    	}
    	if(leftList!=null){
    		ptr.next=leftList;
    	}
    	return fakeNode.next;
    }
}   
