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

#endif // UTILS_H
