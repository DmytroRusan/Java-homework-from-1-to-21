package Task18;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 51 - 25);
        }

        System.out.println(Arrays.toString(array));

        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[i] = array[i];
            } else {
                newArray[i] = 0;
            }
        }

        System.out.println(Arrays.toString(newArray));

    }
}
