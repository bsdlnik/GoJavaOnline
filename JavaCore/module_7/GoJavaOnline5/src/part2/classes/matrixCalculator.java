package part2.classes;

import java.util.Random;

public final class matrixCalculator {

    private matrixCalculator() {
    }

    public static void generateMatrix(int[][] dataArray) {
        Random random = new Random();
        int j;
        for (int i = 0; i < dataArray.length; i++) {
            for (j = 0; j < dataArray[i].length; j++) {
                dataArray[i][j] = random.nextInt(100) + 1;
            }

        }
    }

    public static void renderArray(int[][] dataArray) {
        int j;
        for (int i = 0; i < dataArray.length; i++) {
            for (j = 0; j < dataArray[i].length; j++) {
                if(j == 0) {
                    System.out.printf("%3d", dataArray[i][j]);
                }else
                System.out.printf("%5d",dataArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void  addMatrix(int[][] dataArrayFirst, int[][] dataArraySecond, int[][] dataArrayResult){
        int j;
        for (int i = 0; i < dataArrayFirst.length; i++) {
            for (j = 0; j < dataArrayFirst[i].length; j++) {
                dataArrayResult[i][j] = dataArrayFirst[i][j] + dataArraySecond[i][j];
            }

        }
    }

    public static void  substractMatrix(int[][] dataArrayFirst, int[][] dataArraySecond, int[][] dataArrayResult){
        int j;
        for (int i = 0; i < dataArrayFirst.length; i++) {
            for (j = 0; j < dataArrayFirst[i].length; j++) {
                dataArrayResult[i][j] = dataArrayFirst[i][j] - dataArraySecond[i][j];
            }

        }
    }


}
