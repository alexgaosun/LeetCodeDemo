package 排序;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = {6,7,3,2,5,1};
        for (int end = arr.length - 1; end > 0; end--) {//
            int storeIndex = 1;
            for (int start = 1; start <= end; start++) {//由于end是最后一位因此需要<=
                if (arr[start] < arr[start - 1]) {
                    int tmp = arr[start];
                    arr[start] = arr[start - 1];
                    arr[start - 1] = tmp;
                    storeIndex = start;
                }
            }
            end = storeIndex;//改变end的索引 来优化冒泡

        }

        //如果是有序的 不需要进行排列 通过增加bool变量来区分
        //通过声明一个索引值来记录最后一次排好序的位置在哪里
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "_");
        }
    }
}
