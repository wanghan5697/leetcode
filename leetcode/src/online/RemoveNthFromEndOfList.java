package online;

public class RemoveNthFromEndOfList {

	public ListNode removeNthFromEnd(ListNode head, int n){
		ListNode second = head;
		ListNode temp = new ListNode(-1);
		temp.next=head;
		ListNode first = temp;

		while(--n>0){
			second=second.next;
			
		}
		while(second.next!=null){
			first=first.next;
			second=second.next;
		}
		first.next=first.next.next;
		
		return temp.next;
	}
}
