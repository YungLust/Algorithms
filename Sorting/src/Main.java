import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] genNumbers = Generate.intArray(900, 8150);
        int[] genNumbers2 = genNumbers.clone();
        int[] genNumbers3 = genNumbers.clone();
        System.out.println(Arrays.toString(genNumbers));

        //create different sort strategies
        InsertionSort insertionS = new InsertionSort();
        SelectionSort selectionS = new SelectionSort();
        BubbleSort bubbleS = new BubbleSort();

        //choose sorting strategy for Sorter
        Sorter sorter = new Sorter(bubbleS);
        //now we can sort
        sorter.sort(genNumbers);
        //now we change to another sorting strategy
        sorter.setStrategy(selectionS);
        sorter.sort(genNumbers2);
        sorter.setStrategy(insertionS);
        sorter.sort(genNumbers3);

        System.out.println("Bubble sort: " + Arrays.toString(genNumbers));
        System.out.println("Number of operations: " + bubbleS.getOperationNumber());
        System.out.println("Selection sort: " + Arrays.toString(genNumbers2));
        System.out.println("Number of operations: " + selectionS.getOperationNumber());
        System.out.println("Insertion sort: " + Arrays.toString(genNumbers3));
        System.out.println("Number of operations: " + insertionS.getOperationNumber());
    }
}