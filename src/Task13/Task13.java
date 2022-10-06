package Task13;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число k, щоб побачити кількість зірочок: ");
        int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            System.out.print("* ");
        }
    }
}
