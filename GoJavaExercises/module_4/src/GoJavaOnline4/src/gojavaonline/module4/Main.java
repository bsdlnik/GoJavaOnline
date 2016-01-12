package gojavaonline.module4;

import gojavaonline.module4.calculate.CelsiusFahrenheitCalculator;
import gojavaonline.module4.calculate.DistanceCalculator;
import gojavaonline.module4.calculate.ShapeAreaCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int choice;

        do {

            System.out.println("\n1. Calculate area of triangle");
            System.out.println("2. Calculate area of rectangle");
            System.out.println("3. Calculate area of circle");
            System.out.println("4. Convert Celsius to Fahrenheit");
            System.out.println("5. Convert Fahrenheit to Celsius");
            System.out.println("6. Calculate distance between two points");
            System.out.println("7. Exit");
            System.out.println("\nPlease, enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please, enter size of two edges of triangle:");
                    System.out.println("Size of side A: ");
                    double sideA = scanner.nextFloat();
                    System.out.println("Size of side B: ");
                    double sideB = scanner.nextFloat();

                    System.out.println("Area of triangle: " + ShapeAreaCalculator.calculateAreaOfTriangle(sideA, sideB));

                    break;
                case 2:
                    System.out.println("Please, enter size of edges of rectangle:");
                    System.out.println("Size of side A: ");
                    sideA = scanner.nextFloat();
                    System.out.println("Size of side B: ");
                    sideB = scanner.nextFloat();

                    System.out.println("Area of rectangle: " + ShapeAreaCalculator.calculateAreaOfRectangle(sideA, sideB));

                    break;

                case 3:
                    System.out.println("Please, enter a radius of circle:");
                    System.out.println("Size of radius: ");
                    double radius = scanner.nextFloat();

                    System.out.println("Area of triangle: " + ShapeAreaCalculator.calculateAreaOfCircle(radius));

                    break;
                case 4:
                    System.out.println("Please, enter degree(Celsius):");
                    System.out.println("Degree(Celsius): ");
                    float degree = scanner.nextFloat();

                    System.out.println("Degree(Fahrenheit): " + CelsiusFahrenheitCalculator.celsiusToFahrenheit(degree));

                    break;
                case 5:
                    System.out.println("Please, enter degree(Fahrenheit):");
                    System.out.println("Degree(Fahrenheit): ");
                    degree = scanner.nextFloat();

                    System.out.println("Degree(Celsius): " + CelsiusFahrenheitCalculator.celsiusToFahrenheit(degree));

                    break;
                case 6:
                    System.out.println("Please, enter points coordinates:");
                    System.out.println("Start point coordinate 'X': ");
                    double x1 = scanner.nextFloat();
                    System.out.println("Start point coordinate 'Y': ");
                    double y1 = scanner.nextFloat();
                    System.out.println("End point coordinate 'X': ");
                    double x2 = scanner.nextFloat();
                    System.out.println("End point coordinate 'Y': ");
                    double y2 = scanner.nextFloat();

                    System.out.println("Distance between points: " + DistanceCalculator.calculate(x1, y1, x2, y2));
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("'Unknown command: '" + choice + "' Please enter the correct number.\n");
            }
        } while ( (choice >= 1 ) || (choice <= 6) );
    }
}
