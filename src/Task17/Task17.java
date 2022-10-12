package Task17;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введіть цифру від 1 до 9");
            num = scanner.nextInt();
        } while (num < 1 || num > 9);

        System.out.println("Ваша таблиця множення на " + num);
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " * " + num + " = " + i * num);
        }
    }
}
