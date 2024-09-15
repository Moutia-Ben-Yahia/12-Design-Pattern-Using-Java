public class mainClass{
    public static void main(String[] args){
        Pc xps = new Pc(new PcBuilder().buildCPU("i7").buildGraphicCard("NVIDIA GTX 1650").buildRam(8).buildHardDisc(1000));
        System.out.println(xps.toString());
    }
}
