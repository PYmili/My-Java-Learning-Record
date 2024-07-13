package method_learn;

public class copyFoRange {

    /**
     * 对需要拷贝数组的范围进行计算。
     * @param array_length 原数组长度
     * @param from 数组开始
     * @param to 数组结束
     * @return int
     */
    private static int copy_length(int array_length, int from, int to) {
        int result = to;
        if (from != 0) {
            result = to - from;
        }
        if (to < array_length) {
            result++;
        }
        return result;
    }
    
    /**
     * 通过下标范围对数组进行拷贝。
     * @param array 需要拷贝的数组
     * @param from 开始下标
     * @param to 截止下标
     * @return int[]
     */
    public static int[] copy(int[] array, int from, int to) {
        if (from > array.length || to > array.length) {
            return array;
        } else if (to < from) {
            return array;
        }

        int result[] = new int[copy_length(array.length, from, to)];
        int count = 0;

        for (int i = from; i <= to; i++) {
            result[count] = array[i];
            count++;
        }

        return result;
    }
}
