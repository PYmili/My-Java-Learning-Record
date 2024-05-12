public class array_learn {
    public static int int_array_max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i+1]) {
                max = array[i+1];
            }
        }
        return max;
    }

    public static int[] reverse(int arrary[]) {
        int n = arrary.length;
        int result[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            result[(n - 1) - i] = arrary[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Array max number: " + int_array_max(array));

        int arrary_reverse[] = reverse(array);
        for (int i = 0; i < arrary_reverse.length; i++) {
            System.out.println(arrary_reverse[i]);
        }
    }
}
