package algorithms;

import java.util.ArrayList;

import static utils.Utils.generateOrderedArrayListWithDynamicSize;

public class Recursion {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateOrderedArrayListWithDynamicSize(15);

        System.out.println("Numbers = " + numbers);
        System.out.println("Number found = " + recursiveBinarySearch(numbers, numbers.get(4), 0, numbers.size() - 1));

    }

    private static int recursiveBinarySearch(ArrayList<Integer> numbers, int numberToFind, int low, int high) {
        System.out.println("low = " + low + " high = " + high);
        if (low <= high) {
            int mid = (low + high) / 2;

            if (numbers.get(mid) == numberToFind) {
                return mid;
            }

            if (numberToFind < numbers.get(mid)) {
                return recursiveBinarySearch(numbers, numberToFind, low, mid - 1);
            } else {
                return recursiveBinarySearch(numbers, numberToFind, mid + 1, high);
            }
        }

        return -1;
    }
}
