public class BinarySearch {
    public static void main(String[] args) {

        int[] ints = generateOrderedArrayWithDynamicSize(1000);

        System.out.println("Position in array = " + binarySearch(ints, 30));
    }
    private static int binarySearch(int[] array, int numberToFind) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (numberToFind == array[mid]) {
                return mid;
            }

            if (numberToFind < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    private static int[] generateOrderedArrayWithDynamicSize(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        return array;
    }
}
