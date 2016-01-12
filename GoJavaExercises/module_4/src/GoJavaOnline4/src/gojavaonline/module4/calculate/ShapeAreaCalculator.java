package gojavaonline.module4.calculate;

public class ShapeAreaCalculator {

    public static double calculateAreaOfTriangle(double sideA, double sideB){
        return (sideA * sideB)/2;
    }

    public static double calculateAreaOfRectangle(double sideA, double sideB){
        return (sideA * sideB);
    }

    public static double calculateAreaOfCircle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
}
