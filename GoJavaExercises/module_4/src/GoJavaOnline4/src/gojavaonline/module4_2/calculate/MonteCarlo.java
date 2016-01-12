package gojavaonline.module4_2.calculate;

import java.util.concurrent.TimeUnit;

public class MonteCarlo {

    public static void calculate(int numberOfExperiments, int lengthA, int lengthB){

        double randomTmp;
        double randomX;
        double sum = 0;
        double integral;

        int lengthInterval = lengthB - lengthA;

        for(int i = 0; i < numberOfExperiments; i++){

            randomTmp = Math.random();
            randomX = lengthA + randomTmp*(lengthInterval);
            sum += Math.pow(randomX, 3);
            try {
                TimeUnit.MILLISECONDS.sleep(19);
             } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        integral = lengthInterval*sum/numberOfExperiments;
        System.out.printf("Integral: " + integral);
    }
}
