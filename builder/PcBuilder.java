public class PcBuilder {
    private int Ram;
    private String CPU;
    private String GraphicCard;
    private int HardDisc;
    
    public PcBuilder(){}

    public PcBuilder buildRam(int ram){
        this.Ram=ram;
        return this;
    }
    public PcBuilder buildCPU(String CPU){
        this.CPU=CPU;
        return this;
    }
    public PcBuilder buildGraphicCard(String GraphicCard){
        this.GraphicCard=GraphicCard;
        return this;
    }
    public PcBuilder buildHardDisc(int HardDisc){
        this.HardDisc=HardDisc;
        return this;
    }
    public int getRam(){
        return this.Ram;
    }
    public String getCPU(){
        return this.CPU;
    }
    public String getGraphicCard(){
        return this.GraphicCard;
    }
    public int getHardDisc(){
        return this.HardDisc;
    }

    public Pc BuildPc(){
        return new Pc(this);
    }
}