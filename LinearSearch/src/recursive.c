#include "../../lib/utils.h"
#include <stdio.h>

int alg(int arr[], int n, int key, int i) {
  if (i > n) { // we are no longer in array
    return -1;
  } else if (arr[i] == key) { // we found it and we return index
    return i;
  } else { // we are in array and we didnt find it then we call the function
           // with next index (i+1)
    int ret = alg(arr, n, key, i + 1);
    return ret;
  }
}

int main() {
  int n = 50;
  int key = 10;
  int arr[n];
  generate(arr, n, n + 100);
  printIntArr(arr, n);
  int res = alg(arr, n, key, 0);
  if (res >= 0) {
    printf("The value of [%d] was found with the index [%d]\n", key, res);
  } else {
    printf("Value [%d] was not found!\n", key);
  }
}
