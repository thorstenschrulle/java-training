public class CounterTest {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        for (int i = 0;i <9; i++) {
            myCounter.addValue();
            }
        System.out.println("Aktueller Wert: " + myCounter.getValue());
        myCounter.resetValue();
        System.out.println("Nach dem Löschen: " + myCounter.getValue());
        myCounter.addValue().addValue().addValue();
        System.out.println(myCounter.getValue());
    }
}
