package 链表;

import java.util.HashMap;
import java.util.Map;

public class _1_两数之和 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 4;
        nums[2] = 1;

//        System.out.println(twoSum(nums,5));
        int[] tmpNum = twoSum(nums,5);
        System.out.println("11111111");


//        moveZeroes(nums);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return  new int[0];
    }


}
