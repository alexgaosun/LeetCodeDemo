package 其他;

public class a和b交换 {
    public static void swapTest(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "----" + b);
    }
    public static void swapTest2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a -b;
        System.out.println(a + "----" + b);

    }

    public static void main(String[] args) {
        swapTest(1,4);
        swapTest2(1,4);
    }
}
