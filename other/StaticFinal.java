package other;
public class StaticFinal {
    static int staticNum = 100;
    public static void main(String[] args) {
        final int finalNum = 100;
        System.out.println("Final number:" + finalNum);
        /*Error
         * The final local variable finalNum cannot be assigned. It must be blank and not using a compound assignment
         */
        // finalNum = 200;

        /*Error
         * Illegal modifier for parameter staticNum; only final is permitted
         * static不能再方法中使用
         */
        // static int staticNum = 100;

        System.out.println("Static number:" + staticNum);
        staticNum = 200;
        System.out.println("Static number:" + staticNum);

        /*结论
         * final表示最终版，变量名只能赋值一次，而static与之不同，它可以再次赋值。
         * static表示共享，可以直接被调用。
         */
    }
}
