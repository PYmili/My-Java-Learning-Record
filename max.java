import java.util.Scanner;

public class max {
    public static int number_max(int x, int y) {
        return x > y ? x : y;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.err.print("\nInput number x: ");
            int x = scanner.nextInt();
            System.err.print("\nInput number y: ");
            int y = scanner.nextInt();
            System.err.println("Max: " + number_max(x, y));
        }
    }
}
