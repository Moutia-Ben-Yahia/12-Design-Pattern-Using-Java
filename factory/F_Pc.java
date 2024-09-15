public class F_Pc {
    private int Ram;
    private String CPU;
    private String GPU;
    private int HDD_ROM;
    private int SSD_ROM;
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
    @Override
    public String toString() {
        return "Pc [CPU=" + CPU + ", GPU=" + GPU + ", HDD_ROM=" + HDD_ROM + ", Ram=" + Ram + ", SSD_ROM=" + SSD_ROM + "]";
    } 
}

