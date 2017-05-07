package main.algos.linkedlist;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode result = new ListNode(0);
		ListNode head = result;
		int carry = 0;
		while (l1 != null || l2 != null || carry!=0) {
			ListNode curr = new ListNode(0);
			int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
				
			carry = sum/10;
			curr.val = sum % 10;
			result.next = curr;
			result = curr;
			l1 = (l1 == null) ? l1 : l1.next;
			l2 = (l2 == null) ? l2 : l2.next;
		}
		return head.next;
	}
}
