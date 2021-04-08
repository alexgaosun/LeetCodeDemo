package 链表;

public class _11_盛水最多的容器 {
    public static void main(String[] args) {
        int[] nums = new int[9];
        nums[0] = 1;
        nums[1] = 8;
        nums[2] = 1;
        nums[3] = 2;
        nums[4] = 5;
        nums[5] = 4;
        nums[6] = 8;
        nums[7] = 3;
        nums[8] = 7;
        System.out.println( maxArea2(nums));
//        System.out.println( maxArea2(nums));


//        moveZeroes(nums);
    }

    public static int maxAreaTest(int[] height) {//保证两元素重合
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i],height[j]);
                max = Math.max(max, area);
            }
        }
        return max;
    }
    public static int maxArea(int[] height) {//保证两元素重合（夹逼方案）
        int max = 0;
        for (int i = 0,  j = height.length - 1; i < j;) {//从i往前走， j往后缩减 形成夹击
            int tmpWidth = j - i;//避免i 和 j的值改变
            int tmpMinH =  height[i] < height[j] ? height[i++] : height[j--];//先进行height[i]或者height[j] 再进行i++或者j--
            int area = tmpWidth * tmpMinH;
            max = Math.max(max, area);
        }
        return max;
    }

    public static int maxArea2(int[] height) {//保证两元素重合
        int max = 0;
        for (int i = 0,  j = height.length - 1; i < j;) {
            /*测试 i ++  的区别
            System.out.println(height[i]);
            System.out.println(height[i++]);先取值 后++
            System.out.println(height[i]);
             */

//            if (height[i] < height[j]) {
//                max = Math.max(max, (j - i) * height[i++]);
//            }else {
//                max = Math.max(max, (j - i) * height[j--]);
//            }

            System.out.println("11111111111");
        }
        return max;
    }


    public static int maxArea3(int[] height) {//保证两元素重合
        int max = 0, tmpWidth = 0, tmpHeight = 0;
        for (int i = 0, j = height.length -1 ; i < j;) {
            tmpWidth = j - i;
            tmpHeight = height[i] < height[j] ? height[i++] : height[j--];//先进行height[i]或者height[j] 再进行i++或者j--
            max = Math.max(max, tmpWidth * tmpHeight);
        }
        return max;
    }



}
