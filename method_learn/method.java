package method_learn;

public class method {
    public static void main(String[] args) {
        // 函数重载
        System.out.println(PlusMethod.plus(1.0, 1));
        System.out.println(PlusMethod.plus(1, 1.0));
        System.out.println(PlusMethod.plus(1, 1));
        System.out.println(PlusMethod.plus(1.0, 1.0));

        // copy array
        int array[] = {0, 1, 2, 3, 4};
        array = copyFoRange.copy(array, 0, 3);
        for (int i = 0; i < array.length; i++) {
            System.err.println(array[i]);
        }
    }
}
