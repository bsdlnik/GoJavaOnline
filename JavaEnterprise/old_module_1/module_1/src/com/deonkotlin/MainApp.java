package com.deonkotlin;

import com.deonkotlin.Utils.CollectionCalculationTimeTest;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Java Enterprise. Module #1 ");
        System.out.println("      _____________\n");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        int elementsQuantity = 100_000;
        int testsQuantity = 1000;

        CollectionCalculationTimeTest test = new CollectionCalculationTimeTest();

        String[][] resultTable = new String[15][5];

        for (int i = 0; i < resultTable.length; i++) {
            for (int j = 0; j < resultTable[0].length; j++) {
                resultTable[i][j] = " - ";
            }
        }

        resultTable[0][0] = " # ";
        resultTable[0][1] = "ArrayList";
        resultTable[0][2] = "LinkedList";
        resultTable[0][3] = "HashSet";
        resultTable[0][4] = "TreeSet";

        resultTable[0][0] = " # ";
        resultTable[1][0] = "add(index) top";
        resultTable[2][0] = "add(index) mid";
        resultTable[3][0] = "add(index) end";
        resultTable[4][0] = "get(index) top";
        resultTable[5][0] = "get(index) mid";
        resultTable[6][0] = "get(index) end";
        resultTable[7][0] = "remove(index) top";
        resultTable[8][0] = "remove(index) mid";
        resultTable[9][0] = "remove(index) end";

        resultTable[1][1] = String.valueOf(test.addIndexListTest(arrayList, elementsQuantity, testsQuantity, 0));
        resultTable[2][1] = String.valueOf(test.addIndexListTest(arrayList, elementsQuantity, testsQuantity, elementsQuantity / 2));
        resultTable[3][1] = String.valueOf(test.addIndexListTest(arrayList, elementsQuantity, testsQuantity, elementsQuantity));

        resultTable[4][1] = String.valueOf(test.getListTest(arrayList, elementsQuantity, testsQuantity, 0));
        resultTable[5][1] = String.valueOf(test.getListTest(arrayList, elementsQuantity, testsQuantity, elementsQuantity / 2));
        resultTable[6][1] = String.valueOf(test.getListTest(arrayList, elementsQuantity, testsQuantity, elementsQuantity - 1));

        resultTable[7][1] = String.valueOf(test.removeCollectionTest(arrayList, elementsQuantity, testsQuantity, 0));
        resultTable[8][1] = String.valueOf(test.removeCollectionTest(arrayList, elementsQuantity, testsQuantity, elementsQuantity / 2));
        resultTable[9][1] = String.valueOf(test.removeCollectionTest(arrayList, elementsQuantity, testsQuantity, elementsQuantity - 1));




        resultTable[1][2] = String.valueOf(test.addIndexListTest(linkedList, elementsQuantity, testsQuantity, 0));
        resultTable[2][2] = String.valueOf(test.addIndexListTest(linkedList, elementsQuantity, testsQuantity, elementsQuantity / 2));
        resultTable[3][2] = String.valueOf(test.addIndexListTest(linkedList, elementsQuantity, testsQuantity, elementsQuantity));

        resultTable[4][2] = String.valueOf(test.getListTest(linkedList, elementsQuantity, testsQuantity, 0));
        resultTable[5][2] = String.valueOf(test.getListTest(linkedList, elementsQuantity, testsQuantity, elementsQuantity / 2));
        resultTable[6][2] = String.valueOf(test.getListTest(linkedList, elementsQuantity, testsQuantity, elementsQuantity - 1));

        resultTable[7][2] = String.valueOf(test.removeCollectionTest(linkedList, elementsQuantity, testsQuantity, 0));
        resultTable[8][2] = String.valueOf(test.removeCollectionTest(linkedList, elementsQuantity, testsQuantity, elementsQuantity / 2));
        resultTable[9][2] = String.valueOf(test.removeCollectionTest(linkedList, elementsQuantity, testsQuantity, elementsQuantity - 1));

        System.out.println(arrayList);


        for (int i = 0; i < resultTable.length; i++) {

            for (int j = 0; j < resultTable[0].length; j++) {
                System.out.printf("%-19s   |   ", resultTable[i][j]);
            }
            System.out.println();
        }


    }
}
