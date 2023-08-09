package org.marno;

import java.util.Arrays;

/**
 * AnagramSolver to see if two Strings are anagram
 *
 * Time Complexity: O(n)
 * Auxiliary Space: O(1), for using constant space
 */
public class AnagramSolver {
    static int NO_OF_CHARS = 256;

    /* function to check if two strings are anagrams of each other */
    static boolean areAnagram(char[] str1, char[] str2) {

        /* Create 2 count arrays and initialize all values as 0 */
        int[] count1 = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int[] count2 = new int[NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;

        /* For each character in input strings,
           increment count in the corresponding
           count array */
        for (i = 0; i < str1.length && i < str2.length;
             i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }

        /* If both strings are of different length.
           Removing this condition will make the program
           fail for strings like "aaca" and "aca" */
        if (str1.length != str2.length) {
            return false;
        }

        // Compare count arrays
        for (i = 0; i < NO_OF_CHARS; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

}
