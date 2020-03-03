import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseListsTests {

    @Test
    void sum() {
        assertEquals(55, ExerciseLists.sum(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
        assertEquals(18, ExerciseLists.sum(Arrays.asList(3,6,9)));
        assertEquals(0, ExerciseLists.sum(Arrays.asList(-1, 0, 1)));
        assertEquals(0, ExerciseLists.sum(Arrays.asList(0)));
    }

    @Test
    void mean() {
        assertEquals(5.5, ExerciseLists.mean(Arrays.asList(1,2,3,4,5,6,7,8,9,10)), 1e-5);
        assertEquals(6.0, ExerciseLists.mean(Arrays.asList(3,6,9)), 1e-5);
        assertEquals(0., ExerciseLists.mean(Arrays.asList(-1, 0, 1)), 1e-5);
    }

    @Test
    void variance() {
        assertEquals(8.25, ExerciseLists.variance(Arrays.asList(1,2,3,4,5,6,7,8,9,10)), 1e-5);
        assertEquals(6.0, ExerciseLists.variance(Arrays.asList(3,6,9)), 1e-5);
        assertEquals(2./3., ExerciseLists.variance(Arrays.asList(-1, 0, 1)), 1e-5);
    }

    @Test
    void reverseList() {
        assertEquals(Arrays.asList(3,2,1), ExerciseLists.reverseList(Arrays.asList(1,2,3)));
        assertEquals(Arrays.asList(1,2,3,4,5), ExerciseLists.reverseList(Arrays.asList(5,4,3,2,1)));
        assertEquals(Arrays.asList(5), ExerciseLists.reverseList(Arrays.asList(5)));
        assertEquals(Arrays.asList(), ExerciseLists.reverseList(Arrays.asList(0)));
    }

    @Test
    void reverseString() {
        assertEquals("edcba", ExerciseLists.reverseString("abcde"));
        assertEquals("a", ExerciseLists.reverseString("a"));
        assertEquals("", ExerciseLists.reverseString(""));
    }

    @Test
    void histogram() {
        assertEquals("#\n#####\n###", ExerciseLists.histogram(Arrays.asList(1,5,3)));
        assertEquals("###\n####\n#####\n######", ExerciseLists.histogram(Arrays.asList(3,4,5,6)));
        assertEquals("##########", ExerciseLists.histogram(Arrays.asList(10)));
        assertEquals("", ExerciseLists.histogram(Arrays.asList(0)));
    }

    @Test
    void wordLengths() {
        assertEquals(Arrays.asList(4, 2, 6, 8), ExerciseLists.wordLengths(Arrays.asList("Java", "is", "object", "oriented")));
        assertEquals(Arrays.asList(4, 6, 5), ExerciseLists.wordLengths(Arrays.asList("some", "random", "words")));
        assertEquals(Arrays.asList(0), ExerciseLists.wordLengths(Arrays.asList("")));
    }

    @Test
    void findLongestWord() {
        assertEquals("oriented", ExerciseLists.findLongestWord(Arrays.asList("Java", "is", "object", "oriented")));
        assertEquals("random", ExerciseLists.findLongestWord(Arrays.asList("some", "random", "words")));
        assertEquals("", ExerciseLists.findLongestWord(Arrays.asList("")));
    }

    @Test
    void extractColumn() {
        String s = "2.0,4.0,6.0\n1.0,3.0,5.0\n0.0,2.0,4.0";
        assertEquals(Arrays.asList(2.0, 1.0, 0.0), ExerciseLists.extractColumn(s, 1));
        assertEquals(Arrays.asList(4.0, 3.0, 2.0), ExerciseLists.extractColumn(s, 2));
        assertEquals(Arrays.asList(6.0, 5.0, 4.0), ExerciseLists.extractColumn(s, 3));
    }

    @Test
    void findPythagoreanTriples() {
        assertEquals(
                Arrays.asList(
                        Arrays.asList(3,4,5),
                        Arrays.asList(4,3,5)
                ),
                ExerciseLists.findPythagoreanTriples(10)
        );

        assertEquals(
                Arrays.asList(
                        Arrays.asList(3, 4, 5),
                        Arrays.asList(4, 3, 5),
                        Arrays.asList(5, 12, 13),
                        Arrays.asList(6, 8, 10),
                        Arrays.asList(8, 6, 10),
                        Arrays.asList(8, 15, 17),
                        Arrays.asList(9, 12, 15),
                        Arrays.asList(12, 5, 13),
                        Arrays.asList(12, 9, 15),
                        Arrays.asList(15, 8, 17)
                ),
                ExerciseLists.findPythagoreanTriples(20)
        );
    }
}