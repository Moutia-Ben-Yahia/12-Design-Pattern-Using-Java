public class AbstractFactoryMain{
    public static void main(String[] args){
        shape shape = factory.create("shape").getShape("square");
        shape.Draw();
    }
}
