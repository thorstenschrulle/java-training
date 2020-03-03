import java.util.Random;

public class ExerciseNumbersAndStrings {
    /**
     * Adds a and b and returns the result
     */
    static int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    /**
     * returns a number, where the digits of a and b are concatenated
     * Example: a = 123 (number)   b =  456 (number)
     * Result:  123456 (as a number)
     * @return
     */
    static int concatDigits(int a, int b) {
        // String s ) "" + a + b;
       String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String s = s1 +s2;
      return Integer.parseInt(s);

    }

    /**
     * returns the number of digits of the number n
     * <p>
     * countDigits(0) -> 1
     * countDigits(123) -> 3
     */
    static int countDigits(int a) {
        /*
         return = ("" + Math.abs(a)).length();
        */

        int length = String.valueOf(a).length();
        System.out.println(length);
        if (a < 0) length -= 1;
        return length;
    }

    /**
     * calculates the distance between (x1, y1) und (x2, y2)
     */
    static double distance(double x1, double y1, double x2, double y2) {
       double dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println(dis);
       return dis;
    }

    /**
     * rounds the float number x
     * <p>
     * round already exists - but as an exercise,
     * implement my_round without using round
     */
    static float myRound(float x) {
        // int nr = (int) (x+0.5f);
        // return nr;
     int MyFloat = (int) x;
        System.out.println(x - MyFloat);
     if ((x - MyFloat) >= 0.5 ) MyFloat +=1;
     return MyFloat;
    }

    /**
     * rounds the double number x
     * <p>
     * round already exists - but as an exercise,
     * implement my_round without using round
     */
    static double myRound(double x) {
        int MyDouble = (int) x;
        System.out.println(x - MyDouble);
        if ((x - MyDouble) >= 0.5 ) MyDouble +=1;
        return MyDouble;
    }

    /**
     * return true if n is divisible by d
     * return false otherwise
     */
    static boolean isDivsible(int n, int d) {
        boolean test;
        if ( n % d == 0) return true;
        else return false;
    }

    /**
     * Return the greatest common divisor of a and b
     * Hint: Google for Euklidian algorithm
     */
    static int gcd(int a, int b) {
        /*

        */


        if (a == 0)
            return b;
        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    /**
     * Convert degrees to radians ("Grad in Bodenmaß")
     */
    static double radians(double radians) {
        throw new RuntimeException("not implemented");
    }

    /**
     * checks if the distance between the
     * float numbers a and b is smaller than epsilon
     */
    static boolean closeEnough(double a, double b, double epsilon) {
        throw new RuntimeException("not implemented");
    }

    /**
     * returns the binary representation of n
     * <p>
     * binary(3) returns "11"
     * binary(16) returns "10000"
     * binary(15) returns "1111"
     */
    static String binary(int n) {
        String s2 = Integer.toBinaryString(n);
        return s2;

    }

    /**
     * throw a dice (return a random number from 1 to 6)
     * hint: look at Math.random or java.util.Random
     */
    static int dice() {
        /*
        return (int)(Math.random()*6 +1);
         oder:
        Random r = new Random();
        return r.nextInt(6) +1;
         */
        Random r = new Random();
        int test = r.nextInt(6);
        return test+1;
    }
}