public class NumericOperation extends ArithmeticOperation{
    private int value;
    public NumericOperation(int val){
        this.value=val;
    }
    public NumericOperation(NumericOperation numericOperation, NumericOperation numericOperation2, String string) {
    }
    @Override public int getValue() {
        return this.value;
    }
}
