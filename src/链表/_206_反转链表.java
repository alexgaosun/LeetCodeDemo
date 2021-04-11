package 链表;

import java.util.List;

public class _206_反转链表 {
	
	public ListNode reverseList(ListNode head) {
		//[1，2，3，4，5] -》【5，4，3，2，1】
		if (head == null || head.next == null) return head;
		ListNode newHead = reverseList(head.next);//从4开始弹栈
		head.next.next = head;//4.next = 5 , 5.next = null -> 5.next = 4;完成转换
		head.next = null;//将4.next 掷空，4.next要 最终要指向3
		return newHead;
    }

	
	public ListNode reverseList2(ListNode head) {
		if (head == null || head.next == null) return head;
		//[1，2，3，4，5] -》【5，4，3，2，1】
		ListNode newHead = null;
		while (head != null) {
			//1.保存下一轮节点作为头结点，2.断线，指向反转的节点，3.head赋值给新节点
			ListNode tmp = head.next;//把2拎出来，避免覆盖
			head.next = newHead;//1.next = null
			newHead = head;//newhead 赋值1号节点
			head = tmp;//吧2赋值
		}
		
		return newHead;
    }



	public ListNode reverseListTest(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode pre = null;
		while (head != null) {
			ListNode tmp = head.next;
			head.next = pre;
			pre = head;
			head = tmp; //下一个要遍历的节点
		}
		return pre;
	}



	public ListNode reverseListTest2(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode newHead = reverseListTest2(head.next);
		newHead.next.next = head;
		head.next = null;
		return newHead;
	}




}
