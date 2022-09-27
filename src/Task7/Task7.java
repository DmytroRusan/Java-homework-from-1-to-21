package Task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дробове число: ");
        double num = scanner.nextDouble();
        System.out.println(((int) (num * 100) % 100) / 10);
    }
}
