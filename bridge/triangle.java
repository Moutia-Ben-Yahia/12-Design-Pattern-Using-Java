public class triangle extends BridgeShape{
    public triangle(BridgeColor color){
        super(color);
    }
    @Override public void Draw(){
        System.out.print("triangle colored with ");
        color.Draw();
    }
}
