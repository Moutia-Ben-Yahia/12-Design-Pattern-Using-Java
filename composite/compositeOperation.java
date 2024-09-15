public class compositeOperation extends ArithmeticOperation{
    private ArithmeticOperation firstOP;
    private ArithmeticOperation lastOP;
    private char sign;

    public compositeOperation(ArithmeticOperation first,ArithmeticOperation seconde,char sign){
        this.firstOP=first;
        this.lastOP=seconde;
        this.sign=sign;
    }

    @Override public int getValue(){
        switch(sign){
            case '+':
                return firstOP.getValue() + lastOP.getValue();
            case '-':
                return firstOP.getValue() - lastOP.getValue();
            case '*':
                return firstOP.getValue() * lastOP.getValue();
            case '/':
                return firstOP.getValue() / lastOP.getValue();
            default: 
                throw new RuntimeException("unkhown sign");
        }
    }
}
