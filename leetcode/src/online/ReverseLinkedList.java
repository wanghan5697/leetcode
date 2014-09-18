package online;

public class ReverseLinkedList {

	// recursion 
	public ListNode reverseLinkedList(ListNode head){
		
		if(head==null||head.next==null){
			return head;
		}
		ListNode reverseHead = reverseLinkedList(head.next);
		head.next.next=head;
		head.next=null;
		return reverseHead;
	}
	
	// iterator 
	
	public ListNode reverseIter(ListNode head){
		if(head==null||head.next==null){
			return head;
		}
		ListNode pre = head;
		ListNode cur = head.next;
		ListNode next;
		while(cur!=null){
			next = cur.next;
			cur.next=pre;
			pre= cur;
			cur=next;
		}
		head.next=null;
		head=pre;
		return head;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
