import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseListsTests {

    @Test
    void sum() {
        assertEquals(55, exercises.ExerciseLists.sum(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
        assertEquals(18, exercises.ExerciseLists.sum(Arrays.asList(3,6,9)));
        assertEquals(0, exercises.ExerciseLists.sum(Arrays.asList(-1, 0, 1)));
        assertEquals(0, exercises.ExerciseLists.sum(Arrays.asList(0)));
    }


    @Test
    void mean() {
        assertEquals(5.5, exercises.ExerciseLists.mean(Arrays.asList(1,2,3,4,5,6,7,8,9,10)), 1e-5);
        assertEquals(6.0, exercises.ExerciseLists.mean(Arrays.asList(3,6,9)), 1e-5);
        assertEquals(0., exercises.ExerciseLists.mean(Arrays.asList(-1, 0, 1)), 1e-5);
    }

    @Test
    void variance() {
        assertEquals(8.25, exercises.ExerciseLists.variance(Arrays.asList(1,2,3,4,5,6,7,8,9,10)), 1e-5);
        assertEquals(6.0, exercises.ExerciseLists.variance(Arrays.asList(3,6,9)), 1e-5);
        assertEquals(2./3., exercises.ExerciseLists.variance(Arrays.asList(-1, 0, 1)), 1e-5);
    }

    @Test
    void reverseList() {
        assertEquals(Arrays.asList(3,2,1), exercises.ExerciseLists.reverseList(Arrays.asList(1,2,3)));
        assertEquals(Arrays.asList(1,2,3,4,5), exercises.ExerciseLists.reverseList(Arrays.asList(5,4,3,2,1)));
        assertEquals(Arrays.asList(5), exercises.ExerciseLists.reverseList(Arrays.asList(5)));
        assertEquals(Arrays.asList(), exercises.ExerciseLists.reverseList(Arrays.asList(0)));
    }

    @Test
    void reverseString() {
        assertEquals("edcba", exercises.ExerciseLists.reverseString("abcde"));
        assertEquals("a", exercises.ExerciseLists.reverseString("a"));
        assertEquals("", exercises.ExerciseLists.reverseString(""));
    }

    @Test
    void histogram() {
        assertEquals("#\n#####\n###", exercises.ExerciseLists.histogram(Arrays.asList(1,5,3)));
        assertEquals("###\n####\n#####\n######", exercises.ExerciseLists.histogram(Arrays.asList(3,4,5,6)));
        assertEquals("##########", exercises.ExerciseLists.histogram(Arrays.asList(10)));
        assertEquals("", exercises.ExerciseLists.histogram(Arrays.asList(0)));
    }

    @Test
    void wordLengths() {
        assertEquals(Arrays.asList(4, 2, 6, 8), exercises.ExerciseLists.wordLengths(Arrays.asList("Java", "is", "object", "oriented")));
        assertEquals(Arrays.asList(4, 6, 5), exercises.ExerciseLists.wordLengths(Arrays.asList("some", "random", "words")));
        assertEquals(Arrays.asList(0), exercises.ExerciseLists.wordLengths(Arrays.asList("")));
    }

    @Test
    void findLongestWord() {
        assertEquals("oriented", exercises.ExerciseLists.findLongestWord(Arrays.asList("Java", "is", "object", "oriented")));
        assertEquals("random", exercises.ExerciseLists.findLongestWord(Arrays.asList("some", "random", "words")));
        assertEquals("", exercises.ExerciseLists.findLongestWord(Arrays.asList("")));
    }

    @Test
    void extractColumn() {
        String s = "2.0,4.0,6.0\n1.0,3.0,5.0\n0.0,2.0,4.0";
        assertEquals(Arrays.asList(2.0, 1.0, 0.0), exercises.ExerciseLists.extractColumn(s, 1));
        assertEquals(Arrays.asList(4.0, 3.0, 2.0), exercises.ExerciseLists.extractColumn(s, 2));
        assertEquals(Arrays.asList(6.0, 5.0, 4.0), exercises.ExerciseLists.extractColumn(s, 3));
    }

    @Test
    void findPythagoreanTriples() {
        assertEquals(
                Arrays.asList(
                        Arrays.asList(3,4,5),
                        Arrays.asList(4,3,5)
                ),
                exercises.ExerciseLists.findPythagoreanTriples(10)
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
                exercises.ExerciseLists.findPythagoreanTriples(20)
        );
    }
}