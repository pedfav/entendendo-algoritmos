package algorithms;

import java.util.ArrayList;

import static utils.Utils.generateUnorderedArrayListWithDynamicSize;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumbers = generateUnorderedArrayListWithDynamicSize(15);

        System.out.println("Before selection sort = " + randomNumbers);
        System.out.println("After selection sort = " + orderArrayBySelectionSort(randomNumbers));
    }

    private static ArrayList<Integer> orderArrayBySelectionSort(ArrayList<Integer> numbers) {
        ArrayList<Integer> orderedNumbers = new ArrayList<>();

        while (numbers.size() > 0) {
            int minor = numbers.getFirst();
            int indexToRemove = 0;

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) < minor) {
                    minor = numbers.get(i);
                    indexToRemove = i;
                }
            }

            orderedNumbers.add(minor);
            numbers.remove(indexToRemove);
        }

        return orderedNumbers;
    }
}
