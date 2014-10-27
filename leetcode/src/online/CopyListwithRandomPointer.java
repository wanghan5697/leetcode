package online;

import java.util.HashMap;

public class CopyListwithRandomPointer {
	public RandomListNode copyRandomList(RandomListNode head) {

		if(head==null){
			return null;
		}
		HashMap<RandomListNode, RandomListNode> map= new HashMap<RandomListNode,RandomListNode>();
		//create new list which the head is newhead
		RandomListNode newhead= new RandomListNode(head.label);
		
		map.put(head, newhead); //map stores old list pointer as key, new list pointer as value;
		// create two pointer for two list
		RandomListNode oldp=head.next;
		RandomListNode newp= newhead;
		while(oldp!=null){
			RandomListNode newnode=new RandomListNode(oldp.label);
			map.put(oldp, newnode);
			newp.next=newnode;
			
			oldp=oldp.next;
			newp=newp.next;
		}
		oldp=head;
		newp=newhead;
		while(oldp!=null){
			newp.random=map.get(oldp.random);
			oldp=oldp.next;
			newp=newp.next;
		}
		return newhead;
	}
}
