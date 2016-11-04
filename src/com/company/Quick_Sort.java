package com.company;

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

public class Quick_Sort {


    private int array[];
    private int length;

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void print_Sorted_Array(int[] input) {

        String str = "";
        sort(input);

        for(int i = 0; i < input.length; i++){
            str += input[i]+ " ";
        }
        System.out.println(str);

        }
}

