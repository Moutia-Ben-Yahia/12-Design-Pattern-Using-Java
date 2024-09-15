public class factory {
    public static AbstractFactory create(String type){
        switch(type){
            case "shape":
                return new shapeFactory();
            case "color":
                return new colorFactory();
            default:
                return null;
        }
    }
}
