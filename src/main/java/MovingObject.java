public class MovingObject {
    private double x, y, vx, vy;
    private int radius;
    public MovingObject(double x, double y, double vx, double vy, int rd) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.radius = rd;
    }
    public void draw(Screen s) {
        s.circle((int)x, (int) y, radius);
    }
    public MovingObject move() {
        double newx = x + vx;
        double newy = y + vy;

        if (newx < 0 || newx > 780) {
            vx = -vx;
        }

        if (newy < 0 || newy > 550) {
            vy = -vy;
        }

        x = x + vx;
        y = y + vy;
        return this;
    }


    public static void main(String[] args) {
        MovingObject mv[] = new MovingObject[20];
        Screen screen = new Screen(800, 600);
        screen.line(80, 80, 400, 400);

        for (int i=0; i < mv.length;i++) {
            int posX = (int)(Math.random()*200);
            int posY = (int)(Math.random()*300);
            int speedX =(int)(Math.random()*3+1);
            int speedY = (int)(Math.random()*3+1);
            int radius = (int)(Math.random()*100);

            mv[i] = new MovingObject(posX, posY, speedX, speedY, radius);
        }
        while (true) {
            screen.clear();
            for (int i=0; i < mv.length;i++) {
                mv[i].move().draw(screen);
             }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}