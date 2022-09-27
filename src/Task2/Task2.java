package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть Ваше ім’я: ");
        String name = scanner.nextLine();
        System.out.println("Введіть Ваше прізвище: ");
        String surname = scanner.nextLine();
        System.out.println("Введіть Ваш вік: ");
        int age = scanner.nextInt();

        System.out.println("Моє ім’я: " + name + ". Моє прізвище: " + surname + ". Мені " + age + " років.");
    }
}
