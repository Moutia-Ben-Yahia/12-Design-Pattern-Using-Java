public class Pc {
    private int Ram;
    private String CPU;
    private String GraphicCard;
    private int HardDisc;

    public Pc(PcBuilder builder){
        this.Ram = builder.getRam();
        this.CPU = builder.getCPU();
        this.GraphicCard = builder.getGraphicCard();
        this.HardDisc = builder.getHardDisc();
    } 
    public String toString(){
        return "Ram : " + this.Ram + " GB / CPU : " + this.CPU + " / GraphicCard : " + this.GraphicCard + " / HardDisc : " + this.HardDisc + " GB";
    }
}

