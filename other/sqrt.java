package other;
public class sqrt {
    public static int square(int number) {
        for (int i = 0; i <= number; i++) {
            if ((i * i) == number) {
                return i;
            } else if ((i * i) > number) {
                return --i;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        System.err.println(square(4));
    }
}
