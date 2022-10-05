package Task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введіть друге число: ");
        int num2 = scanner.nextInt();
        int numForNum1 = num1;

        num1 = num2;
        num2 = numForNum1;

        System.out.println("Ваше друге число " + num1);
        System.out.println("Ваше перше число " + num2);
    }
}
