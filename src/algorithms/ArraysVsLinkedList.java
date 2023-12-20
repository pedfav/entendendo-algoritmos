package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;

import static utils.Utils.*;

public class ArraysVsLinkedList {

    public static void main(String[] args) {

        ArrayList<Integer> ints = generateOrderedArrayListWithDynamicSize(10000000);

        long starArray = System.currentTimeMillis();
        System.out.println("Last position in array = " + ints.get(9999999));
        long elapsedTimeMillisArray = System.currentTimeMillis() - starArray;
        System.out.println("Elapsed time = " + elapsedTimeMillisArray);


        LinkedList<Integer> list = generateOrderedLinkedListWithDynamicSize(10000000);
        long starList = System.currentTimeMillis();
        System.out.println("Last position in list = " + list.get(9999999));
        long elapsedTimeMillisList = System.currentTimeMillis() - starList;
        System.out.println("Elapsed time = " + elapsedTimeMillisList);
    }
}
