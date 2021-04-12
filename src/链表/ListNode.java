package 链表;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x; 
	}

	public ListNode testLinkedList(int count) {
		ListNode head = null;
		for (int i = count; i > 0 ; i--) {
			ListNode node = new ListNode(i);
			node.next = head;
			head = node;
		}
		return head;
	}
}
