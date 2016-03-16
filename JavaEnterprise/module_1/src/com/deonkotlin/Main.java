package com.deonkotlin;

import com.deonkotlin.Utils.CollectionTimeTest;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Java Enterprise. Module #1 ");
        System.out.println("____________________________________________________________________________________________\n");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        int testsQuantity = 10;

        CollectionTimeTest test = new CollectionTimeTest();

        String[][] resultTable = new String[5][22];

        resultTable[0][0] = " # ";
        resultTable[1][0] = "ArrayList";
        resultTable[2][0] = "LinkedList";
        resultTable[3][0] = "HashSet";
        resultTable[4][0] = "TreeSet";

        resultTable[0][1] = "add (10k)";
        resultTable[0][2] = "add (100k)";
        resultTable[0][3] = "add (1000k)";

        resultTable[0][4] = "get (10k)";
        resultTable[0][5] = "get (100k)";
        resultTable[0][6] = "get (1000k)";

        resultTable[0][7] = "remove (10k)";
        resultTable[0][8] = "remove (100k)";
        resultTable[0][9] = "remove (1000k)";

        resultTable[0][10] = "contains (10k)";
        resultTable[0][11] = "contains (100k)";
        resultTable[0][12] = "contains (1000k)";

        resultTable[0][13] = "populate (10k)";
        resultTable[0][14] = "populate (100k)";
        resultTable[0][15] = "populate (1000k)";

        resultTable[0][16] = "iterator.add (10k)";
        resultTable[0][17] = "iterator.add (100k)";
        resultTable[0][18] = "iterator.add (1000k)";

        resultTable[0][19] = "iterator.remove (10k)";
        resultTable[0][20] = "iterator.remove (100k)";
        resultTable[0][21] = "iterator.remove (1000k)";

        // add results to table for populate ( 10k )
        resultTable[1][13] = Long.toString(test.populateTestForList(arrayList, 10_000, testsQuantity));
        resultTable[2][13] = Long.toString(test.populateTestForList(linkedList, 10_000, testsQuantity));
        resultTable[3][13] = " - ";
        resultTable[4][13] = " - ";

        // add results to table for populate ( 100k )
        resultTable[1][14] = Long.toString(test.populateTestForList(arrayList, 100_000, testsQuantity));
        resultTable[2][14] = Long.toString(test.populateTestForList(linkedList, 100_000, testsQuantity));
        resultTable[3][14] = " - ";
        resultTable[4][14] = " - ";

        // add results to table for populate ( 1000k )
        resultTable[1][15] = Long.toString(test.populateTestForList(arrayList, 1_000_000, testsQuantity));
        resultTable[2][15] = Long.toString(test.populateTestForList(linkedList, 1_000_000, testsQuantity));
        resultTable[3][15] = " - ";
        resultTable[4][15] = " - ";

        // add results to table for add ( 10k )
        resultTable[1][1] = Long.toString(test.addIndexTestForList(arrayList, 3, testsQuantity));
        resultTable[2][1] = Long.toString(test.addIndexTestForList(linkedList, 3, testsQuantity));
        resultTable[3][1] = Long.toString(test.addTestForSet(hashSet, 10_000, testsQuantity));
        resultTable[4][1] = Long.toString(test.addTestForSet(treeSet, 10_000, testsQuantity));

        // add results to table for add ( 100k )
        resultTable[1][2] = Long.toString(test.addIndexTestForList(arrayList, 3, testsQuantity));
        resultTable[2][2] = Long.toString(test.addIndexTestForList(linkedList, 3, testsQuantity));
        resultTable[3][2] = Long.toString(test.addTestForSet(hashSet,  100_000, testsQuantity));
        resultTable[4][2] = Long.toString(test.addTestForSet(treeSet, 100_000, testsQuantity));

        // add results to table for add ( 1000k )
        resultTable[1][3] = Long.toString(test.addIndexTestForList(arrayList, 3, testsQuantity));
        resultTable[2][3] = Long.toString(test.addIndexTestForList(linkedList, 3, testsQuantity));
        resultTable[3][3] = Long.toString(test.addTestForSet(hashSet, 1_000_000, testsQuantity));
        resultTable[4][3] = Long.toString(test.addTestForSet(treeSet, 1_000_000, testsQuantity));

        for (int i = 0; i < resultTable.length; i++) {

            for (int j = 0; j < resultTable[0].length; j++) {
                System.out.printf("%24s   |", resultTable[i][j]);
                System.out.print("");
                if (j == 21) {
                    System.out.println();
                    for (int k = 0; k < 28 * 22; k++) {
                        System.out.print("_");
                    }
                }
            }
            System.out.println("\n");
        }

        BufferedWriter textWriter = null;
        try {
            textWriter = new BufferedWriter(new FileWriter("results.txt"));

            for (int k = 0; k < 28 * 22; k++) {
                textWriter.write("_");
            }
            textWriter.newLine();
            textWriter.flush();

            for (int i = 0; i < resultTable.length; i++) {
                for (int j = 0; j < resultTable[0].length; j++) {
                    textWriter.write(new Formatter().format("%24s   |", resultTable[i][j]).toString());
                    if (j == 21) {
                        textWriter.newLine();
                        for (int k = 0; k < 28 * 22; k++) {
                            textWriter.write("_");
                        }
                    }
                }
                textWriter.newLine();
                textWriter.flush();
            }

        } catch (IOException e) {
            System.out.println("Error! Cannot create file \"results.txt\"");
        } finally {
            if (textWriter != null) {
                textWriter.close();
            }
        }


       /* System.out.println(new CollectionTimeTest(1000, 100).addIndexTestForList(arrayList));
        System.out.println(CollectionTimeTest.addTimeTest(arrayList, 10_000, 10));*/

        /*System.out.println();

        System.out.println(CollectionTimeTest.getTimeTest(linkedList, 10_000, 10));
        System.out.println(CollectionTimeTest.getTimeTest(arrayList, 10_000, 10));

        System.out.println();

        System.out.println(CollectionTimeTest.removeTimeTest(linkedList, 10_000, 10));
        System.out.println(CollectionTimeTest.removeTimeTest(arrayList, 10_000, 10));

        System.out.println();

        System.out.println(CollectionTimeTest.containsTimeTest(linkedList, 10_000, 10));
        System.out.println(CollectionTimeTest.containsTimeTest(arrayList, 10_000, 10));*/


    }


}
