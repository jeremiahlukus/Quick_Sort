package com.company;
import java.util.*;
/**
 * Created by Jeremiah on 11/4/16.
 *
 * Purpose:
 * Implement and test the quicksort function. This simple implementation will sort an array of integers.
 *
 * TESTS:
 * 1.	Calls quicksort(NULL, 0) to make sure that it doesn't crash.
 * 2.	Calls quicksort to sort an array with just one element.
 * 3.	Calls quicksort to sort an array with 1000 elements (containing the numbers 0 through 1000 in a random order).
 * 4.	Calls quicksort to sort an array that contains 1000 elements with two copies of the numbers from 0 to 499. Check that the array is correct after sorting.
 * 5.	Calls quicksort to sort an array that contains the numbers 0 through 25 already sorted.
 * 6.	Calls quicksort to sort an array that contains the numbers 25 through 0 in reverse order.
 */


public class Main {

    public static void main(String[] args) {

        Quick_Sort sort_Array = new Quick_Sort();
        Fill_Array fill_Array = new Fill_Array();
        int[] empty = {};  // Test 1
        int[] one = {5};  // Test 2
        int[] thousand = new int[1000];  // Test 3
        int [] copies = new int [1000];    // Test 4
        int[] sorted =   {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};     // Test 5
        int[] reversed = {25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};   // Test 6
        // These are for filling the copies array
        int [] array1 = new int [copies.length/2];
        int [] array2 = new int [copies.length/2];

            fill_Array.randomArray(thousand);
            fill_Array.fillArray(array1);
            fill_Array.fillArray(array2);
            fill_Array.mergeArray(copies, array1, array2);

            sort_Array.print_Sorted_Array(empty);
            sort_Array.print_Sorted_Array(one);
            sort_Array.print_Sorted_Array(thousand);
            sort_Array.print_Sorted_Array(copies);
            sort_Array.print_Sorted_Array(sorted);
            sort_Array.print_Sorted_Array(reversed);
        }
    }



