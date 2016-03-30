package com.deonkotlin.Utils;

import java.util.Collection;
import java.util.List;

public class CollectionCalculationTimeTest {

    private long elapsedTime = 0;
    private long startTime = 0;
    private long endTime = 0;
    private long totalTime = 0;
    private long result = 0;

    private void fillList(Collection<Integer> list, int elementsQuantity) {
        for (int i = 0; i < elementsQuantity; i++) {
            list.add(i);
        }
    }

    public long addIndexListTest(List<Integer> list, int elementsQuantity, int testsQuantity, int positionAndValue) {
        totalTime = 0;
        list.clear();
        fillList(list, elementsQuantity);
        for (int i = 0; i < testsQuantity; i++) {
            startTime = System.nanoTime();
            list.add(positionAndValue, positionAndValue);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            totalTime += elapsedTime;
        }
        result = totalTime / testsQuantity;
        return result;
    }

    public long getListTest(List<Integer> list, int elementsQuantity, int testsQuantity, int position) {
        totalTime = 0;

        for (int i = 0; i < testsQuantity; i++) {
            list.clear();
            fillList(list, elementsQuantity);
            startTime = System.nanoTime();
            list.get(position);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            totalTime += elapsedTime;
        }
        result = totalTime / testsQuantity;
        return result;
    }

    public long removeCollectionTest(Collection<Integer> list, int elementsQuantity, int testsQuantity, int position) {
        totalTime = 0;

        for (int i = 0; i < testsQuantity; i++) {
            list.clear();
            fillList(list, elementsQuantity);
            startTime = System.nanoTime();
            list.remove(position);
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            totalTime += elapsedTime;
        }
        result = totalTime / testsQuantity;
        return result;
    }


}
