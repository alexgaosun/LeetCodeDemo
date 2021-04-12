package 链表;

import 链表.ListNode;

public class _2_两数相加 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0; //进位
        while (l1 != null || l2 != null) {
            int tmpL1Val = l1 != null ? l1.val : 0; //l1如果短末位补0
            int tmpL2Val = l2 != null ? l2.val : 0; //l2如果短末位补0
            int sum = tmpL1Val + tmpL2Val + carry; //算出总合
            carry = sum / 10; //能否整除 整除的进位数
            sum = sum % 10; //模运算，得到当前位的余数
            cur.next =  new ListNode(sum);//赋值cur的下一个指针值

            cur = cur.next;//赋值后进入下一层循环
            if(l1 != null) {
                l1 = l1.next;
            }

            if(l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry == 1) {
            cur.next = new ListNode(carry);// 如果取和位数超过
        }

        return pre.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        /*
        1.创建一个预指针，预指针的next指向最终取和后的头结点  ，2.创建临时链表cur
        2.创建一个变量存储 进位的值 carry
        3.如果l1， l2 长度不等 ，短的位数补0
        4.创建sum：  等于 l1.val + l2.val + carry
        5.sun/10 得到  是否能被整除 ， sum%10得到 当前位数
        6.cur 赋值 sum%10， cur.next  = （cur 赋值 sum%10）
        7.如果carry == 1， cun.next = new ListNode(carry);
        8.最终 return pre.next
         */
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int tmpL1Val = l1 != null ? l1.val : 0;
            int tmpL2Val = l2 != null ? l2.val : 0;
            int sum = tmpL1Val + tmpL2Val + carry;
            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;

    }









}
