#include "../lib/utils.h"
#include <stdio.h>

int alg(int arr[], int n, int key, int i) {
  printf("i:%d\n", i);
  if (i > n) { // we are no longer in array
    printf("We didnt find it\n");
    return -1;
  } else if (arr[i] == key) { // we found it and we return index
    printf("We found it\n");
    return i;
  } else { // we are in array and we didnt find it then we call the function
           // with next index (i+1)
    printf("We are finding it\n");
    int ret = alg(arr, n, key, i + 1);
    return ret;
  }
}

int main() {
  int n = 50;
  int key = 10;
  int arr[n];

  int myarr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

  int res = alg(myarr, 10, key, 0);
  if (res >= 0) {
    printf("The value of [%d] was found with the index [%d]\n", key, res);
  } else {
    printf("Value [%d] was not found!\n", key);
  }
}
