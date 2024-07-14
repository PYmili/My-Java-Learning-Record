package String.comparingStrings;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("abc");  // new出来的将放在堆中
        String s2 = "abc";  // 直接赋值的字符串存放在字符串池（StringTable）

        System.out.println();

        // 错误的比较方法
        System.out.println("s1 == s2 -> " + (s1 == s2)); // false

        // 正确的比较方法
        System.out.println("s1.equals(s2) -> " + s1.equals(s2)); // true

        // 不区分大小写比较
        String S1 = new String("java");
        String S2 = "Java";

        System.out.println("S1.equals(S2) -> " + S1.equals(S2)); // false
        System.out.println("S1.equalsIgnoreCase(S2) -> " + S1.equalsIgnoreCase(S2)); // true
    }
}
