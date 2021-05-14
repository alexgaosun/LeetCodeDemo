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

}
