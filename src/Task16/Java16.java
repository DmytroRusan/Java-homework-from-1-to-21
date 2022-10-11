package Task16;

import java.util.Scanner;

public class Java16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввеіть число m");
        int m = scanner.nextInt();
        System.out.println("Введіть число n");
        int n = scanner.nextInt();
        int sum = 0;

        if (m < n) {
            for (int i = m + 1; i < n; i++) {
                if (i % 4 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
        } else if (m > n) {
            for (int i = m - 1; i > n; i--) {
                if (i % 4 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
        }

        if (sum == 0) {
            System.out.println("У проміжку Ваших чисел відсутні ті, які націло діляться на 4 та 5");
        } else {
            System.out.println("Сума Ваших чисел у проміжку між " + m + " та " + n + ", які націло діляться на " +
                    "4 та 5 дорівнює " + sum);
        }
    }
}
