package 其他;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class offer03_数组中重复的数字 {
    public static void main(String[] args) {
        int[] tmpArr = new int[100];
        tmpArr[0] = 10;
        tmpArr[1] = 3;
        tmpArr[2] = 10;
        tmpArr[3] = 2;
        tmpArr[4] = 1;

        System.out.println(findRepeatNumber3(tmpArr));
    }

    public static int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(nums[i])){
                return nums[i];
            }
            hashmap.put(nums[i], i);
        }
        return 0;
    }

    public static int findRepeatNumber2(int[] nums) {
        int temp;
        for(int i=0;i<nums.length;i++){
            while (nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        return -1;
    }
    public static int findRepeatNumber3(int[] nums) {
        int repeat = -1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }




}
