public class shapeFactory implements AbstractFactory{
    @Override public color getColor(String color){
        return null;
    }
    @Override public shape getShape(String shape){
        switch(shape){
            case "rectangle":
                return new rectangle();
            case "square":
                return new square();
            default:
                return null;
        }
    }

}
