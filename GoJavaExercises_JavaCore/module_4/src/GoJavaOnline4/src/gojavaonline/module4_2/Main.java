package gojavaonline.module4_2;

import gojavaonline.module4_2.calculate.MonteCarlo;

import java.lang.management.MonitorInfo;
import java.util.Scanner;

/**
 * Created by Artroot on 12.01.2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of experiments: ");
        int numberOfExperiments = scanner.nextInt();

        System.out.println("\nEnter the interval (a,b)\n");
        System.out.print("a= ");
        int lengthA = scanner.nextInt();
        System.out.print("b= ");
        int lengthB = scanner.nextInt();

        MonteCarlo.calculate(numberOfExperiments,lengthA, lengthB);

    }
}
