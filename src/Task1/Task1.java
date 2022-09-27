package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть будь-яке ціле число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введіть будь-яке ціле число: ");
        int num2 = scanner.nextInt();

        System.out.println("Ваше друге число: " + num2);
        System.out.println("Ваше перше число: " + num1);
    }
}
