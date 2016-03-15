package com.deonkotlin;

import com.deonkotlin.Test.ListTimeTest;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Java Enterprise. Module #1 ");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println( ListTimeTest.addTimeTest(linkedList, 10_000, 100));
        System.out.println( ListTimeTest.addTimeTest(arrayList, 10_000, 100));

        System.out.println();

        System.out.println(ListTimeTest.getTimeTest(linkedList, 10_000, 100));
        System.out.println(ListTimeTest.getTimeTest(arrayList, 10_000, 100));

        System.out.println();

        System.out.println(ListTimeTest.removeTimeTest(linkedList, 10_000, 100));
        System.out.println(ListTimeTest.removeTimeTest(arrayList, 10_000, 100));

        System.out.println();

        System.out.println(ListTimeTest.containsTimeTest(linkedList, 10_000, 100));
        System.out.println(ListTimeTest.containsTimeTest(arrayList, 10_000, 100));







    }
}
