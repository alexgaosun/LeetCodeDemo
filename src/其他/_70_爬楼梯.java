package 其他;

import java.util.HashMap;
import java.util.Map;

public class _70_爬楼梯 {
    /**
     * 爬楼梯
     * 1 f（1）
     * 2 f (2)
     * 3 f(3) = f(1) + f(2) //f(1)1种  f（2）两种；
     * 4 f（3） f（1）+ f（3），//f（1）1种， f（3） 3
     * @param
     * @return
     */
    public static void main(String[] args) {
        System.out.println(climbStairs2(2));
    }
    public static  int climbStairs(int n) {

        if (n == 1 || n == 2) return n;
        int lastpre = 1, pre = 2, res = 0;
        for (int i = 2; i < n; i++) {
            res = lastpre + pre;
            lastpre = pre;
            pre = res;
        }
        return  res;
    }

    public static  int climbStairs2(int n) { //斐波那契数列解法
        if (n==0) return 0;
        int first = 0, second = 1, tmp = second;
        for (int i = 1; i < n; i++) {
            tmp = second;//顶替原来第二个值
            second = second + first;//新的第二个值
            first = tmp;//原第二个 顶替 第一个值
        }
        return second;
    }







}
