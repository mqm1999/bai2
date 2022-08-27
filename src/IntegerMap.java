public class IntegerMap implements Comparable<IntegerMap> {
    int value;
    int amountLargerValue;

    public IntegerMap() {
    }

    public IntegerMap(int value, int amountLargerValue) {
        this.value = value;
        this.amountLargerValue = amountLargerValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getAmountLargerValue() {
        return amountLargerValue;
    }

    public void setAmountLargerValue(int amountLargerValue) {
        this.amountLargerValue = amountLargerValue;
    }

    @Override
    public String toString() {
        return "IntegerMap{" +
                "value=" + value +
                ", amountLargerValue=" + amountLargerValue +
                '}';
    }

    @Override
    public int compareTo(IntegerMap o) {
        int compareMap = ((IntegerMap) o).getValue();
        return this.getValue() - compareMap;
    }
}
