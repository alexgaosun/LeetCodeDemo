package 链表;

import java.util.HashMap;

public class _3_无重复的最长子串 {
    public static int lengthOfLongestSubstring(String s) {//abcabcbb
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int longSubStrLen = 0;
        for (int end = 0; end < s.length(); end++) {
            char tmpChar = s.charAt(end);
            if (map.containsKey(tmpChar)) {
                //比如 "dvdf" ，碰到第二个 d，那么应该移动 i 到 v 这个字符，
                // 因为这样就从窗口里面把第一个 d 略过了,和原来存储的起始位置进行比较
                start = Math.max(map.get(tmpChar) + 1, start);
            }
            //此处加1 是得到字符串的个数，如果i为0则 等于 + 1
            longSubStrLen = Math.max(longSubStrLen, end - start + 1);
            map.put(tmpChar, end);//123
        }
        return longSubStrLen;
    }















    public static int lengthOfLongestSubstring2(String s) {//abcabcbb
        int start = 0, maxStrLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < s.length(); end++) {
            char tmpChar = s.charAt(end);
            if (map.containsKey(tmpChar)) {
                start = Math.max(start, map.get(tmpChar) + 1);
            }
            maxStrLen = Math.max(maxStrLen, end - start + 1);
            map.put(tmpChar, end);
        }
        return maxStrLen;

    }














}
