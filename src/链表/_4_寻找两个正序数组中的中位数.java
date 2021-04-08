package 链表;

import java.util.HashMap;
import java.util.Map;

public class _4_寻找两个正序数组中的中位数 {

    public static void main(String[] args) {
        int[] nums1 = new int[2];
        nums1[0] = 1;
        nums1[1] = 3;
        int[] nums2 = new int[3];
        nums2[0] = 2;
        nums2[1] = 7;
        nums2[2] = 8;
        System.out.println(findMedianSortedArrays2(nums1, nums2));
        System.out.println(5 & 1);
        System.out.println(4 & 1);

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int m = nums1.length;
        int n = nums2.length;
        int len = m + n;
        int left = -1, right = -1;
        int aStart = 0, bStart = 0;
        for (int i = 0; i <= len / 2; i++) {// + 1
            left = right;
            // a的下标小于1号数组的长度
            //或者 b的下标
            if (aStart < m && (bStart >= n || nums1[aStart] < nums2[bStart])) {//a的下标小于1号数组的长度
                right = nums1[aStart++];
            } else {
                right = nums2[bStart++];
            }
        }

        if ((len & 1) == 0)//是否为偶数
            return (left + right) / 2.0;
        else
            return right;

    }



    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int num1Len = nums1.length;
        int num2Len = nums2.length;
        int len = num1Len + num2Len;
        int index1 = 0;
        int index2 = 0;
        int left = -1;
        int right = -1;

        for (int i = 0; i <= len/ 2; i++) {//for (int i = 0; i <= len / 2; i++) {// + 1
            left = right;
            if ((index1 < num1Len) && (index2 >= num2Len || nums1[index1] < nums2[index2])) {
//                (bStart >= n || nums1[aStart] < nums2[bStart])
                right = nums1[index1++];
            }else {
                right = nums2[index2++];
            }

        }
        if ((len & 1) == 0) { //偶数
            return  (left + right)/2.0;
        }else {
            return right;
        }
    }

}
