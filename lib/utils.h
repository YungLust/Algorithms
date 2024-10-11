#ifndef UTILS_H
#define UTILS_H

#include <stdlib.h>

// Function to generate random integers
// with the max value of 'bound'
// for an array with 'n' elements
void generate(int arr[], int size, int bound);

// Function to generate already sorted array
void generateSorted(int arr[], int size, int bound);

// Function to print an integer array
void printIntArr(int arr[], int size);

// Funtion to print some part of array from l(left bound) to r(right bound)
void printIntArrBounded(int arr[], int n, int l, int r);

#endif // UTILS_H
