public class StatementText {
    public static void main(String[] args) {
        double r = Math.random();
        if (r > 0.5) {
            System.out.println("random number larger than 0.5");
        } else {
            System.out.println("smaller or equal 0.5");
        }
        int dice = 1;
        switch (dice) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("0");
        }

        int i = 10;
        while (i > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(i);
        i -= 1; //i--;
    }
}

