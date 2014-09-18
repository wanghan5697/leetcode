package online;

public class AddTwoNumbers {

	//两个list中存的是两个integer，从头节点是个位->十位->百位...
	//创建一个result头结点，用p1,p2,p3来分别指向l1，l2和result
	//用一个carry变量来存每一次的进位，比如如果相加结果>10，carry增加1.
	//
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		int carry = 0;
		ListNode result = new ListNode(0);
		ListNode p1 = l1, p2 = l2, p3 = result;
		
		while (p1 != null || p2 != null) {
			if (p1 != null) {
				carry += p1.val;
				p1 = p1.next;
			}
			if (p2 != null) {
				carry += p2.val;
				p2 = p2.next;
			}
			// 为结果创建一个新的节点，把相加之后的数放入其中。
			p3.next = new ListNode(carry % 10);
			p3 = p3.next;
			//更新carry的值
			carry /= 10;
		}
		// 如果相加结果比之前的list位数要大，则再创建一个新的节点
		if (carry == 1) {
			p3.next = new ListNode(1);
		}
		return result.next;
	}
}