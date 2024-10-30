public class QuickSort implements SortStrategy {
    int operationNumber;

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int l, int r) {
        operationNumber++;
        if (l < r) {
            operationNumber++;
            int pivot = partrition(arr, l, r);
            quickSort(arr, 0, pivot - 1);
            quickSort(arr, pivot + 1, r);
        }
    }

    private int partrition(int[] arr, int l, int r) {
        int pivot = arr[r]; //we take pivot as a last element
        int ptr = l - 1; //bound of sorted part of arr
        operationNumber+=3;
        for (int i = l; i < r; i++) {
            operationNumber+=3;
            if (arr[i] < pivot) {
                ptr++;
                swap(ptr, i, arr);
                operationNumber++;
            }
        }
        swap(ptr + 1, r, arr);
        return ptr+1;
    }

    private void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        operationNumber+=3;
    }

    public int getOperationNumber() {
        return operationNumber;
    }
}
