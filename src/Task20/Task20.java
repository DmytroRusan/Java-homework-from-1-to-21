package Task20;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90 + 10);
        }
        System.out.println(Arrays.toString(array));

        boolean isGrowing = false;
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) { //обмеження, щоб не вийти за межі масиву
                break;
            }
            if (array[i] < array[i + 1]) {
                isGrowing = true;
            } else {
                isGrowing = false;
                break;
            }
        }
        if (isGrowing) {
            System.out.println("Масив є строго зростаючим");
        } else {
            System.out.println("Масив не є строго зростаючим");
        }
    }
}
