#include "utils.h"
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// Function to generate random integers into an array
void generate(int arr[], int n, int bound) {
  srand(time(NULL));

  for (int i = 0; i < n; i++) {
    arr[i] = (rand() % (bound) + 1); // generates from 1 to 100
  }
}

void generateSorted(int arr[], int n, int bound) {
  srand(time(NULL));
  int last = 0;
  int maxAdd = bound / n + 1;
  for (int i = 0; i < n; i++) {
    int randNumb = (rand() % maxAdd + 1);
    arr[i] = last + randNumb;
    last = arr[i];
  }
}

// Function to print an integer array
void printIntArr(int arr[], int n) {
  for (int i = 0; i < n; i++) {
    printf("%d ", arr[i]);
  }
  printf("\n");
}
