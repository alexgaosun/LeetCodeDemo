package 链表;

public class _25_k个一组删除翻转链表 {
    public static void main(String[] args) {
//        System.out.println(testRecursion(100));
//        [1,2] [1,3,4]
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next =  new ListNode(4);

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode pre = hair;

        while (head != null) {
            ListNode tail = pre;
            // 查看剩余部分长度是否大于等于 k
            for (int i = 0; i < k; ++i) {
                tail = tail.next;
                if (tail == null) {
                    return hair.next;
                }
            }
            ListNode nex = tail.next;//保存尾部的后继节点
            ListNode[] reverse = myReverse(head, tail);
            head = reverse[0];
            tail = reverse[1];
            // 把子链表重新接回原链表
            pre.next = head;
            tail.next = nex;
            pre = tail;
            head = tail.next;
        }

        return hair.next;
    }

    public static ListNode[] myReverse(ListNode head, ListNode tail) { //1 ,2 //抽象迭法 翻转内部元素
        //1.保存下一轮节点作为头结点，2.断线，指向反转的节点，3.head赋值给新节点
        ListNode subNewhead = null; // 创建一个新的头节点
        ListNode subHead = head; // head需要回传，head存储，只需改变内部next即可
        while (subNewhead != tail) { //原来是head ！= null 改为 subNewHead ！= tail,内部翻转完毕
            ListNode tmp = subHead.next;
            subHead.next = subNewhead;
            subNewhead = subHead;
            subHead = tmp;
        }
        return new ListNode[]{tail, head};
    }



}

