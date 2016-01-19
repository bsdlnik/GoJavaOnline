package gojavaonline.module4.calculate;

public class DistanceCalculator {

    public static double calculate(double startPointX, double startPointY, double endPointX, double endPointY){
        return  Math.sqrt(Math.pow((startPointX - endPointX ), 2) +  Math.pow((startPointY - endPointY), 2) );
    }
}
