package online;

public class ReverseLinkedListII {
	 public ListNode reverseBetween(ListNode head, int m, int n) {
	        if(head==null||head.next==null){
	        	return head;
	        }
	        ListNode prev = new ListNode(0);
	        prev.next=head;
	        head = prev;
	        ListNode n1 = head;
	        //利用循环找m前一位置的结点
	        int k = m-1;
	        while(k>0){
	        	n1=n1.next;
	        	k--;
	        }        
	        prev = n1;	        
	        n1=n1.next;
	        k=n-m;        
	        //反转m->n之间的部分 
	        while(n1.next!=null&&k>0){
	        	ListNode temp = n1.next;  //n1是反转部分第一个节点，先把n1.next保存起来 放到temp里面
	        	n1.next= temp.next;
	        	temp.next=prev.next;   //prev是m前一个节点
	        	prev.next=temp;
	        	k--;     	
	        	
	        }
	        return head.next;
	 }

}
