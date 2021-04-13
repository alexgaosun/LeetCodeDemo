package 链表;

public class 递归Demo {
    /*
    1.写好一个函数  2.加入递归结束的调节  3.找出等价的关系
    第一步：调用函数本身 会把n轮的值   递推， 只要最后一轮不进结束条件 一直可以递推--------压栈
    第二步：当触发结束递归的条件后 开始回溯： 上一轮的返回值 就是 下一轮的返回结果
    第三步： 直到回溯到最外层 返回最终结果。 由于回溯是可以还原当前轮次调用的参数。
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        int a = testRecursion2(10);
//        testRecursion(5);
//        getRes(nums);
        swapTest(1,3);

    }
    static int testRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        int recur  = testRecursion(n - 1); //调用自身本当成一个值处理
        int res = n + recur; // 前n项的和
        int res2 =  n * recur;//阶乘
        int res3 =  recur;//当前数字倒序排列

        return  res;
    }
    static int testRecursion2(int n) {
        if (n <= 1) {
            return n;
        }
        int recur  = testRecursion2(n - 1); //调用自身本当成一个值处理
        return  recur;
    }

    public static void getRes(int[] arr) {
        getHelper(arr,0,arr.length-1);
    }
    public static void getHelper(int[] arr, int low, int high) { //夹逼方法
        if(low >= high) {
            for (int i = 0; i < arr.length ; i++) {
                System.out.println("---------------------");
                System.out.print(arr[i] + " ");
            }
            return;
        }
        else {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            System.out.println(arr);
            getHelper(arr,low+1,high-1);
        }
    }

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
    static void swapTest(int a, int b) {
        a = a + b;// 4 ，1+3
        b = a - b;// 1 ，4-3
        a = a - b;// a - 1
        System.out.println(a + "----" + b);
        System.out.println("------------");
        a = a ^ b;
        System.out.println(a + "----" + b);
        b = a ^ b;
        System.out.println(a + "----" + b);
        a = a ^ b;
        System.out.println(a + "----" + b);

    }


}
