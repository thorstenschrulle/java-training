
import java.util.ArrayList;
import java.util.List;

public class ExerciseLoops {

    /**
     * return the maximum of a and b
     * <p>
     * (use an if statement, not any builtin functions)
     */
    static int max(int a, int b) {
        if (a >= b) {
            return a;
        };
        return b;

    }

    /**
     * Return the number n as a string, but ...
     * <p>
     * - if the number is divisble by 3, return "fizz" instead
     * - if the number is divisble by 5, return "buzz" instead
     * - if the number is divisble by 3 and 5, return "fizzbuzz" instead
     */
    static String fizzbuzz(int n) {

        if (n % 3 == 0 && n % 5 == 0) return "fizzbuzz";
        if (n % 3 == 0) {
            return "fizz";
        } else if (n % 5 == 0) {
            return "buzz";
        }
        return "" + n;

    }

    /**
     * Add up the numbers a, a+1, a+2, ..., b-1, b
     * <p>
     * Example: summationWhile(3,6) = 3+4+5+6 = 18
     * <p>
     * Use a while loop
     * return 0 if a > b
     */
    static int summationWhile(int a, int b) {
        if (a > b) return 0;
        int meineSumme = a;
        int z = 0;
        while (a <= b) {
            meineSumme += z;
            a++;
            z = a;
        }
        return meineSumme;
    }

    /**
     * Add up the numbers a, a+1, a+2, ..., b-1, b
     * <p>
     * Example: summationFor(3,6) = 3+4+5+6 = 18
     * <p>
     * Use a for loop
     * return 0 if a > b
     */
    static int summationFor(int a, int b) {

        // assertEquals(3+4+5+6, ExerciseLoops.summationFor(3,6));
        // assertEquals(1+2+3+4+5+6+7, ExerciseLoops.summationFor(1,7));
        // assertEquals(0, ExerciseLoops.summationFor(3,2));
        // assertEquals(3, ExerciseLoops.summationFor(3,3));
        if (a > b) return 0;

        int meineSumme = a;

        for (int i = a + 1; i <= b; i++) {
            meineSumme += i;
        }
        return meineSumme;


    }

    /**
     * Return true if c is a vowel (a,e,i,o,u), false otherwise
     */
    static boolean isVowel(char c) {
        throw new RuntimeException("not implemented");
    }

    /**
     * return the number of vowels in string s
     */
    static int countVowels(String s) {
        throw new RuntimeException("not implemented");
    }

    /**
     * Test, if s is a palindrome:
     * <p>
     * palindrome('otto') -> True
     * palindrome('anna') -> True
     * palindrome('abcba') -> True
     * palindrome('a') -> True
     * palindrome('') -> True
     * <p>
     * palindrome('peter') -> False
     * palindrome('abcbb') -> False
     */
    static boolean palindrome(String s) {
        throw new RuntimeException("not implemented");
    }

    /**
     * Implement the following algorithm:
     * Start with number n.
     * <p>
     * If the number is even, divide it by 2
     * If the number is odd, multiply by 3 and add 1
     * Repeat until you reach 1.
     * To keep track of the numbers you produce, create an empty list, and append
     * each new number to the list, including the first number n, and the last number 1
     * The function returns the resulting list of numbers
     */
    static List<Integer> threeNPlusOne(int n) {
        List<Integer> list = new ArrayList<Integer>();
        // list.add(99);
        list.add(n);
        while (n > 1) {
            if (n % 2 == 0) {
                n = n/2;
                list.add(n);

            } else if (n % 2 != 0) {
                System.out.println(n);
                n = n * 3 +1;
                list.add(n);
            }
        }
        return list;
    }
}

