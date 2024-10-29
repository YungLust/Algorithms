/*
 * dont use insertion sort if array is backwards
 * the complexity will be n^2
 * Use it if some part of array is already sorted
 */

public class InsertionSort implements SortStrategy {
    private int operationNumber;

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        operationNumber += 1;
        //we need to start from 1 to skip 0 index being compared to nothing
        for (int i = 1; i < n; i++) {
            operationNumber += 3;
            //we take the last element of sorted part of array (which bound is i)
            for (int j = i - 1; j >= 0; j--) {
                operationNumber += 4;
                //in this scenario we will call j current and j+1 next
                int next = j + 1;
                // if current is greater than next we swap them
                if (arr[j] > arr[next]) {
                    int temp = arr[next];
                    arr[next] = arr[j];
                    arr[j] = temp;
                    operationNumber += 3;
                } else {
                    break;
                }
            }
        }
    }

    public int getOperationNumber() {
        return operationNumber;
    }
}
