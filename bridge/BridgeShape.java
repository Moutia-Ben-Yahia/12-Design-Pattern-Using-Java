public abstract class BridgeShape {
    protected BridgeColor color;
    public BridgeShape(BridgeColor color){
        this.color = color;
    }
    abstract public void Draw();
    
}
