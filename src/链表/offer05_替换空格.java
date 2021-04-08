package 链表;

import java.util.HashMap;

public class offer05_替换空格 {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("abcdabcdebb"));

    }

    public String replaceSpace(String s) {

        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char tmpC = s.charAt(i);
            if (tmpC == ' ') {
                array[size ++] = '%';
                array[size ++] = '2';
                array[size ++] = '0';
            }else {
                array[size ++] = tmpC;
            }
        }
        String newStr = new String(array,0,size);
        return  newStr;
    }


}
