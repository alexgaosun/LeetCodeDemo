package 排序;

public class 快速排序 {
    public static void quickSort(int[] arr,int low,int high){
        int begin,tempEnd,temp,t;
        if(low>high){
            return;
        }
        begin = low; //起始位置
        tempEnd = high; //中点位置
        //temp就是基准位
        temp = arr[low]; //轴点存储临时变量

        while (begin<tempEnd) { //数组下标进行比较
            //先看右边，依次往左递减
            while (temp<=arr[tempEnd] && begin<tempEnd) { //基准元素进行比较
                tempEnd--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[begin] && begin<tempEnd) {
                begin++;
            }
            //如果满足条件则交换
            if (begin < tempEnd) {
                t = arr[tempEnd];
                arr[tempEnd] = arr[begin];
                arr[begin] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[begin];
        arr[begin] = temp;
        //递归调用左半数组
        quickSort(arr, low, tempEnd-1);
        //递归调用右半数组
        quickSort(arr, tempEnd+1, high);
    }

    public static void main(String[] args) {
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
