package org.marno;

public class AnagramApp {
    public static void main( String[] args ) {
        /* Call AnagramSolver */
        if (AnagramSolver.areAnagram(args[0].toCharArray()
                , args[1].toCharArray())) {
            System.out.println("The strings: " + args[0] + " and " + args[1] + " are anagram of each other");
        } else {
            System.out.println("The strings: " + args[0] + " and " + args[1] + " are not anagram of each other");
        }
    }
}
