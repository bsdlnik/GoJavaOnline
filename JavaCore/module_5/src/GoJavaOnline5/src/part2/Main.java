package part2;

import part2.classes.matrixCalculator;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of matrix: ");


        System.out.println("Please enter the N size: ");
        int n = scanner.nextInt();

        System.out.println("Please enter the M size: ");
        int m = scanner.nextInt();

        int[][] dataArrayFirst = new int[n][m];
        int[][] dataArraySecond = new int[n][m];
        int[][] dataArrayResult = new int[n][m];

        matrixCalculator.generateMatrix(dataArrayFirst);
        matrixCalculator.generateMatrix(dataArraySecond);
        matrixCalculator.addMatrix(dataArrayFirst, dataArraySecond, dataArrayResult);

        System.out.println("Generated first array: ");
        System.out.println("________________________________________________________");
        matrixCalculator.renderArray(dataArrayFirst);
        System.out.println("Generated Second array: ");
        System.out.println("________________________________________________________");
        matrixCalculator.renderArray(dataArraySecond);
        System.out.println("Sum of arrays: ");
        System.out.println("________________________________________________________");
        matrixCalculator.renderArray(dataArrayResult);

        matrixCalculator.substractMatrix(dataArrayFirst, dataArraySecond, dataArrayResult);

        System.out.println("Difference of arrays: ");
        System.out.println("________________________________________________________");
        matrixCalculator.renderArray(dataArrayResult);
    }




}
