package exercises;


import java.util.*;

public class ExerciseLists {
    /**
     * Sums all elements in the list
     *
     */
    static int sum(List<Integer> ints) {
        throw new RuntimeException("not implemented");
    }

    /**
     * Calculates the mean/average of the elements
     */
    static double mean(List<Integer> ints) {
        throw new RuntimeException("not implemented");
    }

    /**
     * Calculates the variance of the elements:
     * The sum of the squared differences from the mean,
     * divided by the number of elements
     * (this is the population variance)
     */
    static double variance(List<Integer> ints) {
        throw new RuntimeException("not implemented");
    }

    /**
     * returns a new, reversed list of numbers
     */
    static List<Integer> reverseList(List<Integer> ints) {
        throw new RuntimeException("not implemented");
    }

    /**
     * reverses the given string
     */
    static String reverseString(String s) {
        throw new RuntimeException("not implemented");
    }

    /**
     * Builds a simple histogram as a string from a list of numbers
     *
     * Example:
     *
     * histogram([1,5,3]) -> "#\n#####\n###"
     *
     */
    static String histogram(List<Integer> ints) {
        throw new RuntimeException("not implemented");
    }

    /**
     * creates a list of lengths from a list of words*
     */
    static List<Integer> wordLengths(List<String> words) {
        throw new RuntimeException("not implemented");
    }

    /**
     * finds the longest word in a list of words
     */
    static String findLongestWord(List<String> words) {
        throw new RuntimeException("not implemented");
    }

    /**
     * Reads column columnNumber (starting with 1) from a csv String
     * and returns the values as floats in a list.
     */
    static List<Double> extractColumn(String text, int columnNumber) {
        throw new RuntimeException("not implemented");
    }

    static boolean pythagoreanTriple(int a, int b, int c) {
        return a*a + b*b == c*c;
    }

    /**
     * Returns a list of all pythagorean triples:
     * Numbers a, b, c, where a^2 + b^2 = c^2
     * with 2 <= a,b,c < n
     */
    static List<List<Integer>> findPythagoreanTriples(int n) {
        throw new RuntimeException("not implemented");
    }

    /**
     * Return a map containing the character frequencies fo the String s
     *
     * only count letters and normalize to lower case letters.
     *
     * Return a treemap
     *
     * Example:
     *
     *   getCharFrequencies("abc 12 ABCD") returns a treemap with
     *
     *   a:2, b:2, c:2, d:1
     *
     *
     */
    static Map<Character, Integer> getCharFrequencies(String s) {
        throw new RuntimeException("not implemented");
    }
}
