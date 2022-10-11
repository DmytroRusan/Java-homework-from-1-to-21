package Task15;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишіть число m");
        int m = scanner.nextInt();
        System.out.println("Напишіть число n");
        int n = scanner.nextInt();
        int maxNum = 0;
        if (m < n) {
            for (int i = m + 1; i < n; i++) {
                if (i % 7 == 0 || i % 9 == 0) {
                    maxNum = i;
                }
            }
        } else if (m > n) {
            for (int i = m - 1; i > n; i--) {
                if (i % 7 == 0 || i % 9 == 0) {
                    maxNum = i;
                    break;
                }
            }
        }

        if (maxNum == 0) {
            System.out.println("У проміжку з Ваших чисел не було числа, яке ділилося б націло на 7 або 9");
        } else {
            System.out.println("Максимальне число у Вашому проміжку, яке ділиться націло на 7 та 9 є: " + maxNum);
        }
    }
}
