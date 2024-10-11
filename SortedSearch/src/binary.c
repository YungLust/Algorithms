#include "../../lib/utils.h"
#include <stdio.h>

int alg(int arr[], int n, int key) {
  int rBound = n;
  int lBound = 0;
  int mid = 0;
  while (lBound < rBound) {
    mid = (rBound + lBound) / 2;
    if (arr[mid] == key) {
      return mid;
    } else if (key < arr[mid]) {
      rBound = mid - 1;
    } else {
      lBound = mid + 1;
    }
  }
  return -1;
}

int main() {
  int n = 10;
  int key = 10;
  int arr[n];
  generateSorted(arr, n, 12);
  printIntArr(arr, n);
  int res = alg(arr, n, key);
  if (res >= 0) {
    printf("The value of [%d] was found with the index [%d]\n", key, res);
  } else {
    printf("Value [%d] was not found!\n", key);
  }
}
