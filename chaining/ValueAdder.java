package lang.string.chaining;

public class ValueAdder {
    private int val;

    public ValueAdder add(int addVal){
        val += addVal;
        return this;
    }

    public int getVal() {
        return val;
    }
}
