package online;

import java.util.ArrayList;

public class MergekSortedLists {
	 public ListNode mergeKLists(ArrayList<ListNode> lists) {
		 if(lists==null||lists.size()==0){
			 return null;
		 }
		 return MSort(lists,0,lists.size()-1);
	 }
	 private ListNode MSort(ArrayList<ListNode> lists,int low,int high){
		 while(low<high){
			 int mid=(low+high)/2;
			 ListNode leftList=MSort(lists,low,mid);
			 ListNode rightList=MSort(lists,mid+1,high);
			 return mergeList(leftList,rightList);		 
		 }
		 return lists.get(low);
	 }
	 private ListNode mergeList( ListNode l1, ListNode l2){
		  
		 if(l1==null){
			 return l2;
		 }
		 if(l2==null){
			 return l1;
		 }
		 ListNode head;
		 if(l1.val<l2.val){
			 head=l1;
		 }
		 else{
			 head=l2;
			 l1=l2;
			 l1=head;
		 }
		 while(l1.next!=null&&l2.next!=null){
			 if(l1.next.val<=l2.val){
				 l1=l1.next;
			 }
			 else {
				 ListNode temp=l1.next;
				 l1.next=l2;
				 l2=temp;
			 }
			 
		 }
		 if(l1.next==null)
			 l1.next=l2;
		 return head;
 
	 }

}
