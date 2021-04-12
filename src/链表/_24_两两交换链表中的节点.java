package 链表;

public class _24_两两交换链表中的节点 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next= node3;
        node3.next = node4;
        swapPairs2(node1);

    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;//1
        recursive(dummy);// -1
        return dummy.next;
    }
    // 函数的作用是将 root 后面的两个节点进行互换
    void recursive(ListNode root) {//1,
        if (root.next != null && root.next.next != null) {
            ListNode a = root.next, b = a.next; //a:-1.next = 1, b:1.next =2
            root.next = b;//root.next = 2
            a.next = b.next;//1.next = 3
            b.next = a;// 2.next = 1
            recursive(a);
        }
    }


    public static ListNode swapPairs2(ListNode head) {
        ListNode dummy = new ListNode(-1);//创建一个虚拟节点
        dummy.next = head;//虚拟节点的next指向 head
        ListNode tmp = dummy; //tmp后的两个节点，需要改变后面的，避免head繁盛改变 ，进行临时保存
        while (tmp.next != null && tmp.next.next != null) {
            ListNode a = tmp.next;
            ListNode b = a.next;
            tmp.next = b;
            a.next = b.next;
            b.next = a;
            tmp = a;//只有第一次dummy和tmp指针关联，下次就没有了
        }
        return dummy.next;
    }
}
