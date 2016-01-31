import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        int choice = 0;
        do {
            Menu.renderMenu();
            try {
                choice = DataInput.readLineInt();
            }catch(InputMismatchException e){
                System.out.println("----------------------------------");
                System.out.println("\n Error! Please enter a number \n");
            }

            switch(choice){
                case 1:
                    System.out.println("Enter decimal Number: ");
                    int decimalNumber = 0;
                    try {
                        decimalNumber = DataInput.readLineInt();
                    }catch(InputMismatchException e){
                        System.out.println("----------------------------------");
                        System.out.println("\n Error! Please enter a number \n");
                    }
                    System.out.println("----------------------------------");
                    System.out.println("Calculation result: " + BinaryUtils.decimalToBinaryTwo(decimalNumber) + "\n");
                    break;

                case 2:
                    System.out.println("Enter decimal Number: ");
                    String binaryNumber = DataInput.readLineBin();
                    System.out.println("----------------------------------");
                    System.out.println("Calculation result: " + BinaryUtils.binaryToDecimal(binaryNumber) + "\n");
                    break;
                case 3:
                    System.exit(0);
            }
        }while ( (choice == 1 ) || (choice == 2) );

        System.out.println("Выход из цикла");

       /* long startTime, endTime, resultTime;

        System.out.println();
        startTime = System.currentTimeMillis();
        System.out.println(BinaryUtils.decimalToBinaryOne(999));
        endTime = System.currentTimeMillis();
        resultTime = endTime - startTime;
        System.out.println();
        System.out.println(resultTime);

        startTime = System.currentTimeMillis();
        System.out.println(BinaryUtils.decimalToBinaryTwo(999));
        endTime = System.currentTimeMillis();
        resultTime = endTime - startTime;
        System.out.println();
        System.out.println(resultTime);

        startTime = System.currentTimeMillis();
        System.out.println(BinaryUtils.decimalToBinaryThree(999));
        endTime = System.currentTimeMillis();
        resultTime = endTime - startTime;
        System.out.println();
        System.out.println(resultTime);

        System.out.println();

        System.out.println(BinaryUtils.binaryToDecimal("1111100111"));*/




    }
}
