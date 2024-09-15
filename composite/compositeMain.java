public class compositeMain {
    public static void main(String[] args) {
        ArithmeticOperation first = new NumericOperation(5);
        System.out.println(first.getValue()); 
        ArithmeticOperation seconde = new compositeOperation(new NumericOperation(6),new NumericOperation(7),'*');
        System.out.println(seconde.getValue());
    }
}
