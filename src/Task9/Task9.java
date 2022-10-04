package Task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть будь-яке число або цифру: ");
        int num = scanner.nextInt();
        if (num > 0 && (num > 0 && num < 10)) {
            System.out.println("Ви ввели додатню цифру " + num);
        } else if (num > 0 && num > 9) {
            System.out.println("Ви ввели додатнє число " + num);
        } else if (num < 0 && (num < 0 && num > -10)) {
            System.out.println("Ви ввели від’ємну цифру " + num);
        } else if (num < 0 && num < -9) {
            System.out.println("Ви ввели від’ємне число " + num);
        } else if (num == 0) {
            System.out.println("Ви ввели нуль");
        }
    }
}
