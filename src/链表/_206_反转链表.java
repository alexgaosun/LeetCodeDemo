package 链表;

import java.util.List;

public class _206_反转链表 {
	
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) return head;
	
		ListNode newHead = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
    }

	
	public ListNode reverseList2(ListNode head) {
		if (head == null || head.next == null) return head;
	
		ListNode newHead = null;
		while (head != null) {
			ListNode tmp = head.next;
			head.next = newHead;
			newHead = head;
			head = tmp;
		}
		
		return newHead;
    }



	public ListNode reverseListTest(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode newHead = null;
		ListNode tmp = null;//存储下一个
		while (newHead.next != null) {
			tmp = head.next;
			head.next = newHead;
			newHead = head;
			head = tmp;
		}
		return newHead;
	}



	public ListNode reverseListTest2(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode newHead = reverseListTest2(head.next);
		newHead.next.next = head;
		head.next = null;
		return newHead;
	}




}
