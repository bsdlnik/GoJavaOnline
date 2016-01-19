package part1;

import part1.classes.ArrayTools;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] dataArray = {9, 1, 8, 7, 2, 3, 4, 5, 0, 9};

        System.out.println("Original array: " +  Arrays.toString(dataArray));
        System.out.println();

        System.out.println("Minimal element of array is: " + ArrayTools.findMin(dataArray));
        System.out.println("Maximal element of array is: " + ArrayTools.findMax(dataArray));
        System.out.println();

        ArrayTools.mirrorArray(dataArray);
        System.out.println("Reversed array: " +  Arrays.toString(dataArray));
        System.out.println();

        ArrayTools.bubbleSort(dataArray);
        System.out.println("Bubble sort:    " +  Arrays.toString(dataArray));

        ArrayTools.selectSort(dataArray);
        System.out.println("Select sort:    " +  Arrays.toString(dataArray));

        ArrayTools.insertSort(dataArray);
        System.out.println("Insert sort:    " +  Arrays.toString(dataArray));

        ArrayTools.shellSort(dataArray);
        System.out.println("Shell sort:     " +  Arrays.toString(dataArray));


    }
}
