#include "../../lib/utils.h"
#include <stdio.h>

int alg(int arr[], int n, int key, int l, int r) {
  int mid = 0;
  if (l >= r) {
    return -1;
  } else {
    mid = (r + l) / 2;
    if (arr[mid] == key) {
      return mid;
    } else if (key < arr[mid]) {
      r = mid - 1;
      alg(arr, n, key, l, r);

    } else {
      l = mid + 1;
      alg(arr, n, key, l, r);
    }
  }
}

int main() {
  int key = 10;
  int arr[10] = {1, 2, 3, 4, 5, 6, 7, 9, 10, 11};
  int res = alg(arr, 10, key, 0, 0);
  printf("res:%d\n", res);
  if (res >= 0) {
    printf("The value of [%d] was found with the index [%d]\n", key, res);
  } else {
    printf("Value [%d] was not found!\n", key);
  }
}
