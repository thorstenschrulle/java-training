import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseNumbersAndStringsTest {

    @Test
    void add() {
        assertEquals(3, ExerciseNumbersAndStrings.add(1,2));
        assertEquals(-3, ExerciseNumbersAndStrings.add(-1,-2));
        assertEquals(0, ExerciseNumbersAndStrings.add(2,-2));
        assertEquals(2, ExerciseNumbersAndStrings.add(2,0));
    }

    @Test
    void concatDigits() {
        assertEquals(123456, ExerciseNumbersAndStrings.concatDigits(123, 456));
        assertEquals(0, ExerciseNumbersAndStrings.concatDigits(0, 0));
        assertEquals(11, ExerciseNumbersAndStrings.concatDigits(1, 1));
    }

    @Test
    void countDigits() {
        assertEquals(3, ExerciseNumbersAndStrings.countDigits(123));
        assertEquals(7, ExerciseNumbersAndStrings.countDigits(1234567));
        assertEquals(1, ExerciseNumbersAndStrings.countDigits(0));
        assertEquals(2, ExerciseNumbersAndStrings.countDigits(-10));
    }

    @Test
    void distance() {
        assertEquals(Math.sqrt(2), ExerciseNumbersAndStrings.distance(1, 1, 2, 2), 1e-5);
        assertEquals(1, ExerciseNumbersAndStrings.distance(0, 0, 1, 0), 1e-5);
        assertEquals(1, ExerciseNumbersAndStrings.distance(0, 1, 0, 0), 1e-5);
    }

    @Test
    void myRoundFloat() {
        assertEquals(1, ExerciseNumbersAndStrings.myRound(0.6f));
        assertEquals(1, ExerciseNumbersAndStrings.myRound(0.5f));
        assertEquals(0, ExerciseNumbersAndStrings.myRound(0.4f));
    }

    @Test
    void myRoundDouble() {
        assertEquals(1, ExerciseNumbersAndStrings.myRound(0.6));
        assertEquals(1, ExerciseNumbersAndStrings.myRound(0.5));
        assertEquals(0, ExerciseNumbersAndStrings.myRound(0.4));
    }

    @Test
    void isDivsible() {
        assertTrue(ExerciseNumbersAndStrings.isDivsible(12,3));
        assertTrue(ExerciseNumbersAndStrings.isDivsible(12,4));
        assertTrue(ExerciseNumbersAndStrings.isDivsible(1,1));
        assertFalse(ExerciseNumbersAndStrings.isDivsible(12,5));
        assertFalse(ExerciseNumbersAndStrings.isDivsible(5,12));
        assertFalse(ExerciseNumbersAndStrings.isDivsible(1,3));
    }

    @Test
    void gcd() {
        assertEquals(4, ExerciseNumbersAndStrings.gcd(12,8));
        assertEquals(6, ExerciseNumbersAndStrings.gcd(12,6));
        assertEquals(3, ExerciseNumbersAndStrings.gcd(9,12));
        assertEquals(1, ExerciseNumbersAndStrings.gcd(7,13));
        assertEquals(56, ExerciseNumbersAndStrings.gcd(56,56));
    }

    @Test
    void radians() {
    }

    @Test
    void closeEnough() {
    }

    @Test
    void binary() {
        assertEquals("111", ExerciseNumbersAndStrings.binary(7));
        assertEquals("1000", ExerciseNumbersAndStrings.binary(8));
        assertEquals("11111111", ExerciseNumbersAndStrings.binary(255));
        assertEquals("100000000", ExerciseNumbersAndStrings.binary(256));
        assertEquals("0", ExerciseNumbersAndStrings.binary(0));
    }

    @Test
    void dice() {
        Set<Integer> set = new TreeSet<Integer>();

        Set<Integer> targetSet = new TreeSet<Integer>(Arrays.asList(1,2,3,4,5,6));

        for (int i=0; i<= 1000; i++) {
            set.add(ExerciseNumbersAndStrings.dice());
        }

        assertEquals(targetSet, set);
    }
}