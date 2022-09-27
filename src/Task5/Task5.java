package Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дробове число грошей: ");
        double money = scanner.nextDouble();
        int result = (int) (money * 100) % 100;
        System.out.println(result);

    }
}
