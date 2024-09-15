public class colorFactory implements AbstractFactory{
    @Override public shape getShape(String shape){
        return null;
    }
    @Override public color getColor(String color){
        switch(color){
            case "red":
                return new red();
            case "blue":
                return new blue();
            default:
                return null;
        }
    }
}
