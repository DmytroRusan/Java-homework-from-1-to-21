package Task19;

import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        double array1MiddleNum = 0.0;
        double array2MiddleNum = 0.0;
        for (int i = 0; i < 5; i++) {
            array1[i] = (int) (Math.random() * 6);
            array1MiddleNum += array1[i];
            array2[i] = (int) (Math.random() * 6);
            array2MiddleNum += array2[i];
        }
        array1MiddleNum /= array1.length;
        array2MiddleNum /= array2.length;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        System.out.println(array1MiddleNum);
        System.out.println(array2MiddleNum);

        if (array1MiddleNum > array2MiddleNum) {
            System.out.println("Середнє арифметичне першого масиву більше, ніж другого");
        } else if (array1MiddleNum < array2MiddleNum) {
            System.out.println("Середнє арифметичне другого масиву більше, ніж першого");
        } else {
            System.out.println("Середнє арифметичне першого і другого масивів рівні");
        }

    }
}
