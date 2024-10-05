#include "../lib/utils.h"
#include <stdio.h>

int alg(int arr[], int n, int key) {
  int last;
  last = arr[n - 1]; // save the last element of arr
  int i = 0;
  while (arr[i] != key) { // if we found key we end while-loop
    i++;
  }

  // we can merge conditions because
  // if the last==key it means that 'i' is alredy has the index of last element
  if (i < n || last == key) {
    return i;
  } else {
    return -1;
  }
}

int main() {
  int n = 50;
  int key = 10;
  int arr[n];
  generate(arr, n, n + 100);
  printIntArr(arr, n);
  int res = alg(arr, n, key);
  if (res > 0) {
    printf("The value of [%d] was found with the index [%d]\n", key, res);
  } else {
    printf("Value [%d] was not found!\n", key);
  }
}
