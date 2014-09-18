package online;

public class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(ListNode head){
		
		if(head==null){
			return null;
		}
		if(head.next==null){
			return head;
		}
		ListNode cur = head;
		ListNode prev = head;
		cur = prev.next;
		while(prev.next!=null){
			if(cur.val==prev.val){
				prev.next=cur.next;
				cur=cur.next;
			}
			else {
			prev= cur; 
			cur=cur.next;
			}
		}
		return head;
	}
}
