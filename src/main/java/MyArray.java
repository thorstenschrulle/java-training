import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        int[] table = { 1,2,3,4,5,6,7};  // array initalisieren und speicher reservieren

        for (int i=0; i < args.length;i++) {
            System.out.println(i + " -> " + args[i]);
          //  System.out.println(args[i]);
        }
        for (int i=0; i < table.length;i++) {
          System.out.println(i + " -> " + table[i]);
           // System.out.println(table[i]);
        }

    }
}
