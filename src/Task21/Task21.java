package Task21;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть годину з 0 до 23:");
        int h = scanner.nextInt();
        if (h < 0 || h > 23) {
            System.out.println("Такої години не існує");
            return;
        }
        System.out.println("Введіть хвилину з 0 до 60");
        int m = scanner.nextInt();
        if (m < 0 || m > 59) {
            System.out.println("Такої хвилини не існує");
            return;
        }
        System.out.println("Введіть секунду");
        int s = scanner.nextInt();
        if (s < 0 || s > 59) {
            System.out.println("Такої секунди не існує");
            return;
        }
        s++;
        if (s == 60) {
            m++;
            s = 0;
        }
        if (m == 60) {
            h++;
            m = 0;
        }
        if (h == 24) {
            h = 0;
        }
        System.out.println("Ваш час через одну секунду буде: " + h + ":" + m + ":" + s);

    }
}
