package Task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введіть друге число: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Число " + num1 + " більше за " + num2);
        } else if (num1 < num2) {
            System.out.println("Число " + num2 + " більше за " + num1);
        } else {
            System.out.println("Числа рівні");
        }
    }
}
