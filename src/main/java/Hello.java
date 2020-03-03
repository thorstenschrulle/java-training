public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Reihe " + i);
            if (i == 7) {
                System.out.println("Bin bei 7");

            }
            int x = 0;
            while (x < 5) {
                String meinText = "Ich befinde mich in Runde " + i + " " + x;
                System.out.println(meinText);
                x++;
            }
        }
    }
}
