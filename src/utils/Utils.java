package utils;

public class Utils {

    public static int[] generateOrderedArrayWithDynamicSize(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        return array;
    }
}
