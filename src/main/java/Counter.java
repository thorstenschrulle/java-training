class Counter {
    private int value = 0;

    public int getValue() {
        return value;
    }
    public Counter addValue() {
        value++;
        return this;
    }
    public Counter resetValue() {
        value= 0;
        return this;
    }

}
