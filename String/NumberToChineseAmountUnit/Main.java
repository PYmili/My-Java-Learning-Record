package String.NumberToChineseAmountUnit;

import java.util.Scanner;

import String.NumberToChineseAmountUnit.src.ChineseAmountUnit;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            
            ChineseAmountUnit chineseAmountUnit = new ChineseAmountUnit();
            System.out.println(chineseAmountUnit.toAmountUnit(input));

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
