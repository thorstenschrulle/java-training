import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseLoopsTest {

    @Test
    void max() {
        assertEquals(5, ExerciseLoops.max(3, 5));
        assertEquals(5, ExerciseLoops.max(5, 3));
        assertEquals(1, ExerciseLoops.max(0, 1));
        assertEquals(-3, ExerciseLoops.max(-3, 1-5));
    }

    @Test
    void fizzbuzz() {
        assertEquals("1", ExerciseLoops.fizzbuzz(1));
        assertEquals("2", ExerciseLoops.fizzbuzz(2));
        assertEquals("fizz", ExerciseLoops.fizzbuzz(3));
        assertEquals("4", ExerciseLoops.fizzbuzz(4));
        assertEquals("buzz", ExerciseLoops.fizzbuzz(5));
        assertEquals("14", ExerciseLoops.fizzbuzz(14));
        assertEquals("fizzbuzz", ExerciseLoops.fizzbuzz(15));
        assertEquals("16", ExerciseLoops.fizzbuzz(16));
    }

    @Test
    void summationWhile() {
        assertEquals(3+4+5+6, ExerciseLoops.summationWhile(3,6));
        assertEquals(1+2+3+4+5+6+7, ExerciseLoops.summationWhile(1,7));
        assertEquals(0, ExerciseLoops.summationWhile(3,2));
        assertEquals(3, ExerciseLoops.summationWhile(3,3));
    }

    @Test
    void summationFor() {
        assertEquals(3+4+5+6, ExerciseLoops.summationFor(3,6));
        assertEquals(1+2+3+4+5+6+7, ExerciseLoops.summationFor(1,7));
        assertEquals(0, ExerciseLoops.summationFor(3,2));
        assertEquals(3, ExerciseLoops.summationFor(3,3));
    }

    @Test
    void isVowel() {
        for (char c  : Arrays.asList('a', 'e', 'i', 'o', 'u')) {
            assertTrue(ExerciseLoops.isVowel(c));
            assertTrue(ExerciseLoops.isVowel(Character.toUpperCase(c)));
        }

        for (char c  : Arrays.asList('b', 'c', 'd', 'f','g','h','j','k',
                'l','m','n','p','q','r','s','t','v','w','x','y','z')) {
            assertFalse(ExerciseLoops.isVowel(c));
            assertFalse(ExerciseLoops.isVowel(Character.toUpperCase(c)));
        }
    }

    @Test
    void countVowels() {
        assertEquals(5, ExerciseLoops.countVowels("hund katze maus"));
        assertEquals(4, ExerciseLoops.countVowels("aabbccddee"));
        assertEquals(5, ExerciseLoops.countVowels("AeIoU"));
        assertEquals(0, ExerciseLoops.countVowels("XYZ"));
        assertEquals(0, ExerciseLoops.countVowels(""));
    }

    @Test
    void palindrome() {
        assertTrue(ExerciseLoops.palindrome("otto"));
        assertTrue(ExerciseLoops.palindrome("anna"));
        assertTrue(ExerciseLoops.palindrome("abcba"));
        assertTrue(ExerciseLoops.palindrome("a"));
        assertTrue(ExerciseLoops.palindrome(""));

        assertFalse(ExerciseLoops.palindrome("peter"));
        assertFalse(ExerciseLoops.palindrome("abcbb"));
    }

    @Test
    void threeNPlusOne() {
        assertEquals(Arrays.asList(3,10,5,16,8,4,2,1), ExerciseLoops.threeNPlusOne(3));
        assertEquals(Arrays.asList(4,2,1), ExerciseLoops.threeNPlusOne(4));
        assertEquals(Arrays.asList(1), ExerciseLoops.threeNPlusOne(1));
        assertEquals(Arrays.asList(7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16,8, 4, 2, 1), ExerciseLoops.threeNPlusOne(7));
    }
}