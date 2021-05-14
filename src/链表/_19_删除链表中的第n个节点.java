package 链表;

import java.util.Deque;
import java.util.LinkedList;

public class _19_删除链表中的第n个节点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        int length = getLength(head);
        for (int i = 1; i < length - n + 1; i++) { //用虚拟节点遍历的 因此 在原生的基础上+1
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }
    public static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }





    //栈
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        Deque<ListNode> stack = new LinkedList<>();
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        return dummy.next;

    }
    //双节点
    public ListNode removeNthFromEnd3(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        return dummy.next;

    }
}
