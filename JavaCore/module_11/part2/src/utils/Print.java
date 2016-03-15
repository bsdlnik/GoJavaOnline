package utils;

import flowers.BaseFlower;
import flowers.RoseFlower;

import java.util.List;

public final class Print {

    private Print() {

    }

    public static void printStream(List<BaseFlower> list) {
        list
                .stream()
                .forEach(p -> System.out.println(p));
    }

    public static void nameSort(List<BaseFlower> list) {

        list
                .stream()
                .sorted((flowerOne, flowerTwo) -> flowerOne.getColor().compareTo(flowerTwo.getColor()))
                .forEach(System.out::println);

    }


}
