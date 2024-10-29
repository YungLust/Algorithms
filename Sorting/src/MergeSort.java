/*
 * Dont use merge if you want to use as less memory as u can
 * it creates (log n) of new arrays from the main one
 * all of them take a lot of space, if default array is big.
 */
public class MergeSort implements SortStrategy{
    int operationNumber;

    public void sort(int[] arr) {
        int n = arr.length;
        operationNumber++;
        if (n == 1) {
            return;
        }
        int mid = n / 2;
        operationNumber++;

        //divide arrays into 2
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];
        operationNumber+=2;

        int i = 0; //for left arr
        int j = 0; //for right arr
        operationNumber+=2;

        for (; i < n; i++) {
            operationNumber+=3;
            if (i < mid) {
                leftArr[i] = arr[i];
                operationNumber++;
            } else {
                rightArr[j] = arr[i];
                j++;
                operationNumber+=2;
            }
        }

        /*
         * sort() divides the default array to pieces
         * then they sorted and merged back in merge()
         */
        sort(leftArr);
        sort(rightArr);
        merge(arr, leftArr, rightArr);
    }

    //this method merges arr into leftArr and rightArr
    private void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
        int i = 0, l = 0, r = 0;
        operationNumber+=3;
        while (l < leftSize && r < rightSize) {
            operationNumber+=3;
            if (leftArr[l] < rightArr[r]) {
                arr[i] = leftArr[l];
                i++;
                l++;
                operationNumber+=3;
            } else {
                arr[i] = rightArr[r];
                i++;
                r++;
                operationNumber+=3;
            }
        }

        /*
         *if there is still element in left or right array
         * we just put it in arr
         */
        while (l < leftSize) {
            arr[i] = leftArr[l];
            i++;
            l++;
            operationNumber+=4;
        }
        while (r < rightSize) {
            arr[i] = rightArr[r];
            i++;
            r++;
            operationNumber+=4;
        }
    }

    int getOperationNumber(){
        return operationNumber;
    }
}
