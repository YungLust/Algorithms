#include "utils.h"
#include <stdio.h>
#include <time.h>

// Function to generate random integers into an array
void generate(int arr[], int n) {
  srand(time(NULL));

  for (int i = 0; i < n; i++) {
    arr[i] = (rand() % 100) + 1; // generates from 1 to 100
  }
}

// Function to print an integer array
void printIntArr(int arr[], int n) {
  for (int i = 0; i < n; i++) {
    printf("%d ", arr[i]);
  }
  printf("\n");
}
