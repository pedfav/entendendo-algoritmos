package utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Utils {

    public static int[] generateOrderedArrayWithDynamicSize(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        return array;
    }

    public static ArrayList<Integer> generateOrderedArrayListWithDynamicSize(int size) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            array.add(i);
        }

        return array;
    }

    public static ArrayList<Integer> generateUnorderedArrayListWithDynamicSize(int size) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            array.add(new Random().ints(0, 50)
                    .findFirst()
                    .getAsInt());
        }

        return array;
    }

    public static LinkedList<Integer> generateOrderedLinkedListWithDynamicSize(int size) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        return list;
    }
}
