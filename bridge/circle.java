public class circle extends BridgeShape{
    public circle(BridgeColor color){
        super(color);
    }
    @Override public void Draw(){
        System.out.print("circle colored with ");
        color.Draw();
    }
}
