import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class StatementText {
    public static void main(String[] args) {

        Random r = new Random();
        int geheimzahl = r.nextInt(1);
        int anzahl = 0;

        while (true) {
            anzahl += 1;
            System.out.println("Bitte gebe Deine Zahl ein:");
            Scanner s = new Scanner((System.in));
            try {
                int eingabe = s.nextInt();
                if (eingabe == geheimzahl) {
                    if (anzahl == 1) {
                        System.out.println("Klasse, Du hast " + anzahl + " Versuch gebraucht");
                    } else System.out.println("Klasse, Du hast " + anzahl + " Versuche gebraucht");

                    break;
                } else {
                    System.out.println("Falsch");
                }
            } catch (InputMismatchException e) {
                System.out.println("Nur Zahlen !!!");

            }

        }

    }
}


