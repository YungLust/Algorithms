#include "../lib/utils.h"
#include <stdio.h>

int alg(int arr[], int n, int key) {
  for (int i = 0; i < n; i++) {
    if (arr[i] == key) {
      return i;
    }
  }
  return -1;
}

int main() {
  int n = 50;
  int key = 10;
  int arr[n];
  generate(arr, n, n + 100);
  printIntArr(arr, n);
  int res = alg(arr, n, key);
  if (res >= 0) {
    printf("The value of [%d] was found with the index [%d]\n", key, res);
  } else {
    printf("Value [%d] was not found!\n", key);
  }
}
