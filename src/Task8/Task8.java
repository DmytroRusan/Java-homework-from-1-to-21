package Task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть чотиризначне число: ");
        int num = scanner.nextInt();
        System.out.println(num / 1000);
        System.out.println(num / 100 % 10);
        System.out.println(num % 100 / 10);
        System.out.println(num % 10);
    }
}
