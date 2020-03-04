public class MovingObjectCaller {
    public static void main(String[] args) {
        MovingObject mv = new MovingObject(1, 4, 1, 3);
        System.out.println("PosX: " + mv.getPosX() + " PosY: " + mv.getPosY());

        for (int i = 0; i < 30; i++) {
            System.out.println(i);
            System.out.println("Before PosX: " + mv.getPosX() + " PosY: " + mv.getPosY());
            mv.mvObj();
            System.out.println("AFter PosX: " + mv.getPosX() + " PosY: " + mv.getPosY());
        }

    }
}
