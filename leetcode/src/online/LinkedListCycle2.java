package online;

public class LinkedListCycle2 {

	public ListNode detectCycle(ListNode head){
		if(head==null){
			return null;
		}
		ListNode slow= head;
		ListNode fast= head;
		while (fast.next!=null&&fast.next.next!=null){
			slow= slow.next;
			fast= fast.next.next;
			if (slow ==fast){
				break;
			}
		}
		
		if(fast==null||fast.next==null){
			return null;
		}
		
		slow = head; 
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;
			}
		return fast;
	
	}
		
	}
