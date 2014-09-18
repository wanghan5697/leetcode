package online;

public class RotateList {
	public ListNode rotateRight(ListNode head, int n) {
		if (head == null || head.next == null || n <= 0) {
			return head;
		}

		ListNode walker = head;
		ListNode runner = head;
		int len = 0;
		ListNode countLen = head;
		ListNode newhead = new ListNode(-1);
		while (countLen != null) {
			len++;
			countLen = countLen.next;
		}

		n = n % len;// if n is greater than length of the list
		if (n == 0) {
			return head;
		}

		for (int i = 0; i < n; i++) {
			runner = runner.next;
		}
		while (runner.next != null) {
			walker = walker.next;
			runner = runner.next;
		}

		newhead = walker.next;
		walker.next = null;
		runner.next = head;
		return newhead;

	}

}
