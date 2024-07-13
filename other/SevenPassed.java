package other;
public class SevenPassed {
    public static void passed(int number) {
        if ((number % 7) == 0 || number % 10 == 7 || ((number / 10) % 10) == 7) {
            System.err.println("过");
        } else {
            System.err.println(number);
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            passed(i);;
        }
    }
}
