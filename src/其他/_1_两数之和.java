package 其他;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class _1_两数之和 {
    public static void main(String[] args) {
        int[] nums = new int[21];//初始化会确定容量
        Random random = new Random();
        for (int i = 0; i < 21; i++) {
            int seed = random.nextInt(21);
            nums[i] = seed;
        }
        testIndex(nums);

//        int[] tmpNum = twoSum(nums,5);
//        System.out.println("11111111");


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

    static void testIndex (int [] arr) {
        int[] temp = new int[21];
        for (int i = 0; i < arr.length; i++) {
            int tmpE = arr[i];
            temp[tmpE]++; // 将元素作为下标，比如 arr 下标0的元素是 3  ， 插入在temp 下标为3的位置
        }
        //顺序打印
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < temp[i]; j++) {
                System.out.println(i);
            }
        }
    }


}
