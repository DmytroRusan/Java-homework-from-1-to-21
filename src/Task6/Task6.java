package Task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціле двозначне число: ");
        int num = scanner.nextInt();
        String ourNum = Integer.toString(num);

        if (ourNum.length() == 2) {
            System.out.println("Перша цифра Вашого числа : " + num / 10);
        } else {
            System.out.println("Ви ввели не двозначне ціле число.");
        }

    }
}
