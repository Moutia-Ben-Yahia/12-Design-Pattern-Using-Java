public class DellXps implements visitable{
     int Ram;
     String CPU;
     String GPU;
     int HDD_ROM;
     int SSD_ROM;
     double cost;
     double price;
    
    public DellXps(int ram, String cPU, String gPU, int hDD_ROM, int sSD_ROM, double cost, double price) {
        this.Ram = ram;
        this.CPU = cPU;
        this.GPU = gPU;
        this.HDD_ROM = hDD_ROM;
        this.SSD_ROM = sSD_ROM;
        this.cost = cost;
        this.price = price;
    }

    @Override
    public String toString() {
        return "DellXps [CPU=" + CPU + ", GPU=" + GPU + ", HDD_ROM=" + HDD_ROM + ", Ram=" + Ram + ", SSD_ROM=" + SSD_ROM
                + ", cost=" + cost + ", price=" + price + "]";
    }


    
    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String cPU) {
        CPU = cPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String gPU) {
        GPU = gPU;
    }

    public int getHDD_ROM() {
        return HDD_ROM;
    }

    public void setHDD_ROM(int hDD_ROM) {
        HDD_ROM = hDD_ROM;
    }

    public int getSSD_ROM() {
        return SSD_ROM;
    }

    public void setSSD_ROM(int sSD_ROM) {
        SSD_ROM = sSD_ROM;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void accept(visitor v){}
    
}
