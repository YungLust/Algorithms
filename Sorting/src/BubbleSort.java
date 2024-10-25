class BubbleSort implements SortStrategy {
    private int operationNumber;

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        operationNumber++; //i init
        for (int i = 0; i < n - 1; i++) {
            operationNumber += 3;//j init + for
            for (int j = 0; j < n - i - 1; j++) {
                operationNumber += 2;
                if (arr[j] > arr[j + 1]) {
                    operationNumber += 3;
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public int getOperationNumber() {
        return operationNumber;
    }
}