#include "../lib/utils.h"
#include <stdio.h>

int alg(int arr[], int n, int key) {
  int res;
  int last;
  arr[n - 1] = last; // save the last element of arr
  int i;
  for (i = 0; i < n; i++) {
    if (arr[i] == key) {
      break; // if we found the key we end for-loop
    }
  }

  // we can merge conditions because
  // if the last==key it means that 'i' is the index of last element
  if (i < n || last == key) {
    res = i;
  } else {
    res = -1;
  }
  return res;
}

int main() {
  int n = 25;
  int key = 10;
  int arr[n];
  generate(arr, 25, 15);
  printIntArr(arr, 25);
  int res = alg(arr, n, key);
  if (res > 0) {
    printf("The value of [%d] was found with the index [%d]\n", key, res);
  } else {
    printf("Value [%d] was not found!\n", key);
  }
}
