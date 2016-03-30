package ua.goit.java;

import org.testng.annotations.Test;



import java.util.Arrays;
import java.util.List;

public class Generics {

    /*@Test
    public void testGenericTypesOld() throws Exception {
        List ints = Arrays.asList(10, 20.30);
        for (Object anInt : ints) {
            Integer i = (Integer)anInt;
            System.out.println(i);
        }

    }
*/
    @Test
    public void testGenericTypeSafe() throws Exception {
        List<Integer> ints = Arrays.asList(10, 20, 30);
        for (Integer anInt : ints) {
            System.out.println(anInt);
        }
    }

    @Test
    public void testGenericSubtypes() throws Exception {
        List<Number> numbers;
        List<Integer> integers = Arrays.asList(10, 20, 30);
        //numbers = integers;
    }

    @Test
    public void testArraysSubTypes() throws Exception {
        Number[] numbers;
        Integer[] integers = new Integer[]{10, 20, 30};
        numbers = integers;
        //numbers[2] = 10.3;

    }

    @Test
    public void testName() throws Exception {

    }
}
