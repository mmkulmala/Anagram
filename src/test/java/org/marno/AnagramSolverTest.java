package org.marno;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit tests to check anagrams
 */
public class AnagramSolverTest {

    @Test
    public void shouldAnswerTrueWhenTwoStringsAreCommentary() {
        char[] first = "coronavirus".toCharArray();
        char[] second =  "carnivorous".toCharArray();
        assertTrue(AnagramSolver.areAnagram(first, second));
    }

    @Test
    public void shouldAnswerFalseWhenTwoStringsAreDifferentSizes() {
        char[] first = "aaca".toCharArray();
        char[] second = "aca".toCharArray();
        assertFalse(AnagramSolver.areAnagram(first, second));
    }

    @Test
    public void shouldAnswerTrueWhenTwoStringsAreSynonyms() {
        char[] first = "evil".toCharArray();
        char[] second = "vile".toCharArray();
        assertTrue(AnagramSolver.areAnagram(first, second));
    }

    @Test
    public void shouldAnswerTrueWhenTwoStringsAreAnagram() {
        char[] first = "eleven plus two".toCharArray();
        char[] second = "twelve plus one".toCharArray();
        assertTrue(AnagramSolver.areAnagram(first, second));
    }

    @Test
    public void shouldAnswerFalseIfNotAnagram() {
        char[] first = "gram".toCharArray();
        char[] second = "arm".toCharArray();
        assertFalse(AnagramSolver.areAnagram(first, second));
    }
}
