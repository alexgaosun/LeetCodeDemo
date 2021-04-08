package 链表;

import java.lang.reflect.Array;

public class _283_移动零 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 0;
        nums[2] = 0;
        nums[3] = 5;
        nums[4] = 6;
        moveZeroes(nums);
    }
    static int[] moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }

        return nums;
    }
























}
















