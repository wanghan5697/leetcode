package online;

public class ConvertSortedListtoBinarySearchTree {
	static ListNode h;
	  
	public TreeNode sortedListToBST(ListNode head){  
		    
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return new TreeNode(head.val);
		}
		h=head;
		int len = 0;
		ListNode p = head;
		while (p != null) {
			len++;
			p = p.next;
		}

		return sortedList(head, 0, len - 1);

	}

	public TreeNode sortedList(ListNode head, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode left = sortedList(head, start, mid - 1);
		TreeNode root = new TreeNode(h.val);

		
		root.left=left;
		h = h.next;
		root.right = sortedList(head, mid + 1, end);
		return root;
	
	}

	public static void main(String args[]) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(4);
		head.next.next = new ListNode(5);
		head.next.next.next = new ListNode(6);
		TreeNode root = new ConvertSortedListtoBinarySearchTree()
				.sortedListToBST(head);
		System.out.println(root.val);
	}

}
