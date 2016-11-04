package com.company;

import java.util.*;

/**
 * Created by Jeremiah on 11/4/16.
 *
 * Fills the arrays needed for this program
 *
 *
 */
public class Fill_Array {

    public static void randomArray(int[] input) {
        int length = input.length;
        Random generator = new Random();
        for (int i = 0; i < length; i++) {
           int random = generator.nextInt(1001);
            input[i] = random;
        }
    }

    public static void fillArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = i;
        }
    }

    public static void mergeArray(int[] endArray, int[] array1, int[] array2) {


        // Merging two array with the same numbers to get copies.
        int index = array2.length;

        for (int i = 0; i < array2.length; i++) {
            endArray[i] = array2[i];
        }
        for (int i = 0; i < array1.length; i++) {
            endArray[i + index] = array1[i];
        }
    }
}
