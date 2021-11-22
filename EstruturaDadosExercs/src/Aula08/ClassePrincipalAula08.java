package Aula08;

public class ClassePrincipalAula08 {
    public static void main(String[] args) {

        int quantity = 1000;
        int[] array = new int[quantity];

        System.out.println("Vetor inicial: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*quantity);

            System.out.println(array[i]);
        }

        long startTimeInsertionSort = System.currentTimeMillis();
        int[] finalArrayInsertionSort = insertionSort(array);
        long endTimeInsertionSort = System.currentTimeMillis();

        printResults("Insertion Sort:", startTimeInsertionSort, endTimeInsertionSort, finalArrayInsertionSort);


        long startTimeBubbleSort = System.currentTimeMillis();
        int[] finalArrayBubbleSort = bubbleSort(array);
        long endTimeBubbleSort = System.currentTimeMillis();

        printResults("Bubble Sort:", startTimeBubbleSort, endTimeBubbleSort, finalArrayBubbleSort);


        long startTimeQuickSort = System.currentTimeMillis();
        int[] finalArrayQuickSort = quickSort(array, 0, array.length-1);
        long endTimeQuickSort = System.currentTimeMillis();

        printResults("Quick Sort:", startTimeQuickSort, endTimeQuickSort, finalArrayQuickSort);


        long startTimeSelectionSort = System.currentTimeMillis();
        int[] finalArraySelectionSort = selectionSort(array);
        long endTimeSelectionSort = System.currentTimeMillis();

        printResults("Selection Sort:", startTimeSelectionSort, endTimeSelectionSort, finalArraySelectionSort);
    }

    private static int[] selectionSort(int[] array) {
        for (int fixed = 0; fixed < array.length - 1; fixed++) {
            int smaller = fixed;

            for (int i = smaller + 1; i < array.length; i++) {
                if (array[i] < array[smaller]) {
                    smaller = i;
                }
            }
            if (smaller != fixed) {
                int t = array[fixed];
                array[fixed] = array[smaller];
                array[smaller] = t;
            }
        }

        return array;
    }

    private static int[] quickSort(int[] array, int start, int end) {
        if (start < end) {
            int posicaoPivo = separate(array, start, end);
            quickSort(array, start, posicaoPivo - 1);
            quickSort(array, posicaoPivo + 1, end);
        }

        return array;
    }

    private static int separate(int[] array, int start, int end) {
        int pivo = array[start];
        int i = start + 1, f = end;
        while (i <= f) {
            if (array[i] <= pivo)
                i++;
            else if (pivo < array[f])
                f--;
            else {
                int troca = array[i];
                array[i] = array[f];
                array[f] = troca;
                i++;
                f--;
            }
        }
        array[start] = array[f];
        array[f] = pivo;
        return f;
    }

    private static int[] insertionSort(int[] array) {
        int j;
        int key;
        int i;

        for (j = 1; j < array.length; j++) {
            key = array[j];

            for (i = j - 1; (i >= 0) && (array[i] > key); i--) {
                array[i + 1] = array[i];
            }

            array[i + 1] = key;
        }

        return array;
    }

    private static int[] bubbleSort(int array[]){
        boolean change = true;
        int aux;
        while (change) {
            change = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    change = true;
                }
            }
        }

        return array;
    }

    private static void printResults(String title, long startTime, long endTime, int[] finalArray ){
        System.out.println("\n"+ title);

        System.out.println("Executado em " + (endTime - startTime) + " ms");

        System.out.println("Array final:");

        for (int i = 0; i < finalArray.length; i++) {
            System.out.println(finalArray[i]);
        }
    }
}


