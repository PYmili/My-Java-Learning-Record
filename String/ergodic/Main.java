package String.ergodic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input: ");
            String input = scanner.next();
            for (int i = 0; i < input.length(); i++) {
                System.out.println(input.charAt(i));
            }
        } catch (Exception e) {
            System.err.println("Scanner input Error");
        }
    }
}
