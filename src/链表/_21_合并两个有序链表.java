package 链表;

public class _21_合并两个有序链表 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {//[1,2] [1,3,4]
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {//当l2（3）
            l1.next  = mergeTwoLists(l1.next, l2); //  当 l1(2),  le1（2）.next = l2(3) 此时l1 [2,3,4]
            return l1;
        }else {
            l2.next  = mergeTwoLists(l1, l2.next);// 目的是 走到l2的最后一个节点
            return l2;
        }


        // L2发起第一轮递-mergeTwoLists (l1(1), l2(3)) //l1val 1, l2val 1
        // L1发起 第二轮递（1<3）:mergeTwoLists (l1(2), l2(3))//l1val 1, l2val 3
        // L1发起 第三轮递(l1 == null) 直接返回L2  此时L2（3）//l1val 2, l2val 3
        // L1回溯第三轮 ：l1.next = L2(3)  返回l1（2）//此时l1(2) [2,3,4] // l1val 2, l2val 3
        // L1回溯第二轮 ：//l1val 1, l2val 3 :  因此 l1（1）.next = l1(2)[2,3,4]
        // L2回溯第一轮：//l1val 1, l2val 1： l2.next = l1(1) [1,2,3,4]
        //最终返回 L2
    }
}
