package part1.classes;

public class ArrayTools {
    public static int findMin(int[] dataArray) {
        int minElement = dataArray[0];
        for (int i = 1; i < dataArray.length; i++){
            if (dataArray[i] < minElement) {
                minElement = dataArray[i];
            }
        }
        return (minElement);
    }

    public static int findMax(int[] dataArray) {
        int maxElement = dataArray[0];
        for (int i = 1; i < dataArray.length; i++){
            if (dataArray[i] > maxElement) {
                maxElement = dataArray[i];
            }
        }
        return (maxElement);
    }

// Ментору =) Сюда можно не смотреть. Увлекся )

    public static void mirrorArray(int[] dataArray){
        for (int i = 0; i < dataArray.length/2; i++) {
            swapElements(dataArray, i, dataArray.length-1-i);
        }
    }

    // всплытие элемента в топ like bubble
    public static void bubbleSort(int[] dataArray) {
        for (int barrier = dataArray.length - 1; barrier > 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (dataArray[index] > dataArray[(index + 1)]) {
                    swapElements(dataArray, index, index+1);
                }
            }
        }
    }

    // выбор наименьшего елемента и перемещение в 1-ю позицию, второго наименьшего во 2-ю
    public static void selectSort(int[] dataArray){
        for (int i = 0; i < dataArray.length; i++) {
            int minElementIndex = i;
            for (int j = i+1; j < dataArray.length; j++) {
                if (dataArray[j] < dataArray[minElementIndex]) {
                    minElementIndex = j;
                }
                swapElements(dataArray, i, minElementIndex);
            }
        }
    }

    // просмотр элементом поочередно и вставка на свое место среди просмотренных
    public static void insertSort(int[] dataArray){
        for (int i = 1; i < dataArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (dataArray[j] < dataArray[j - 1]) {
                   swapElements(dataArray, dataArray[j], dataArray[j - 1]);
                }

            }

        }
    }

    public static void shellSort(int[] dataArray){
        int intervalSequence = 1;
        int inner, outer;
        int temp;

        while (intervalSequence <= dataArray.length / 3){
            intervalSequence = 3 * intervalSequence +1; // Интервальная последовательность  Кнута
        }
        //System.out.println(intervalSequence); ткстовый вывод

        while (intervalSequence > 0){
            for (outer = intervalSequence; outer < dataArray.length; outer++) {
                temp = dataArray[outer];
                inner = outer;

                while(inner >  intervalSequence - 1 && dataArray[inner - 1] >= temp){
                    dataArray[inner] = dataArray[inner - intervalSequence];
                    inner -= intervalSequence;
                }
                dataArray[inner] = temp;
            }
            intervalSequence = (intervalSequence - 1) / 3;
        }
    }

    private static void swapElements(int[] dataArray, int firstElement, int secondElement){
        int tmp = dataArray[firstElement];
        dataArray[firstElement] = dataArray[secondElement];
        dataArray[secondElement] = tmp;
    }

}
