package String.createString;

public class Main {
    public static void main(String[] args) {
        // 1
        String s1 = "This is String 1.";
        System.out.println(s1);
        // 2
        String s2 = new String("This is String 2.");
        System.out.println(s2);
        // 3
        char[] char1 = {'S', 't', 'r', 'i', 'n', 'g', ' ', '3'};
        String s3 = new String(char1);
        System.out.println(s3);
        // 4
        byte[] bytes = {97, 98, 99, 100};
        String s4 = new String(bytes);
        System.out.println(s4);
    }
}
