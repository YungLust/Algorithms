import java.util.Arrays;

public class SelectionSort implements SortStrategy {
    private int operationNumber;

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        operationNumber++;
        for (int i = 0; i < n; i++) { //2n+1
            int minIndex = i;
            operationNumber += 2; //j and minIndex initialization
            for (int j = i; j < n; j++) {
                operationNumber += 2;
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
                operationNumber += 2;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            operationNumber += 3;
        }
    }

    public int getOperationNumber() {
        return operationNumber;
    }
}
