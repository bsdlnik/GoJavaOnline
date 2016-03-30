package com.deonkotlin.Utils;

import java.util.List;
import java.util.Set;

public class CollectionTimeTest {

    private long elapsedTime = 0;
    private long startTime = 0;
    private long endTime = 0;
    private long result = 0;

    public long addIndexTestForList(List<Integer> list, int testsQuantity, int index) {
        result = 0;
        list.clear();
        if (list.size() < index) {
            for (int i = 0; i <= index + 2; i++) {
                list.add(i);
            }
        }
        for (int i = 0; i < testsQuantity; i++) {
            startTime = System.currentTimeMillis();
            list.add(index, index);
            endTime = System.currentTimeMillis();
            elapsedTime = endTime - startTime;
            result += elapsedTime;
        }
        return result / testsQuantity;
    }

    public long addTestForSet(Set<Integer> set, int elementsQuantity, int testsQuantity) {
        result = 0;
        for (int i = 0; i < testsQuantity; i++) {
            set.clear();
            startTime = System.currentTimeMillis();
            for (int j = 0; j < elementsQuantity; j++) {
                set.add(j);
            }
            endTime = System.currentTimeMillis();
            elapsedTime = endTime - startTime;
            result += elapsedTime;
        }
        return result / testsQuantity;
    }

    public long populateTestForList(List<Integer> list, int elementsQuantity, int testsQuantity) {
        result = 0;
        for (int i = 0; i < testsQuantity; i++) {
            list.clear();
            startTime = System.currentTimeMillis();
            for (int j = 0; j < elementsQuantity; j++) {
                list.add(j, j);
            }
            endTime = System.currentTimeMillis();
            elapsedTime = endTime - startTime;
            result += elapsedTime;
        }
        return result / testsQuantity;
    }







 /*   public static long addTimeTest(List<Integer> list, int elementsQuantity, int testsQuantity) {

        long result = 0;
        for (int i = 0; i < testsQuantity; i++) {
            list.clear();
            long startTime = System.nanoTime();
            for (int j = 0; j < elementsQuantity; j++) {
                list.add(j);
            }
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            result += elapsedTime;
        }
        return result / testsQuantity;

    }*/

    public static long getTimeTest(List<Integer> list, int elementsQuantity, int testsQuantity) {

        long result = 0;
        list.clear();
        for (int i = 0; i < elementsQuantity; i++) {
            list.add(i);
        }
        for (int i = 0; i < testsQuantity; i++) {
            long startTime = System.nanoTime();
            for (int j = 0; j < elementsQuantity; j++) {
                list.get(j);
            }
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            result += elapsedTime;
        }

        return result / testsQuantity;

    }

    public static long removeTimeTest(List<Integer> list, int elementsQuantity, int testsQuantity) {

        long result = 0;
        for (int i = 0; i < testsQuantity; i++) {
            list.clear();
            for (int k = 0; k < elementsQuantity; k++) {
                list.add(k);
            }
            long startTime = System.nanoTime();
            for (int j = 0; j < elementsQuantity; j++) {
                list.remove(new Integer(j));
            }
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            result += elapsedTime;
        }

        return result / testsQuantity;

    }

    public static long containsTimeTest(List<Integer> list, int elementsQuantity, int testsQuantity) {

        long result = 0;
        int findValue = elementsQuantity - 1;
        list.clear();
        for (int k = 0; k < elementsQuantity; k++) {
            list.add(k);
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < elementsQuantity; i++) {
            if (list.contains(findValue)) {
                break;
            }
        }
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        result += elapsedTime;

        return result / testsQuantity;

    }

    public static long populateTimeTest() {
        return 0;
    }

    public static long addIteratorTimeTest() {
        return 0;
    }

    public static long removeIteratorTimeTest() {
        return 0;
    }

    public static double convertToMs(long nanoSeconds) {
        return nanoSeconds / 1_000_000;
    }


}
