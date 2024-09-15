public class visitorMain {
    public static void main(String[] args) {
        DellXps pc1 = new DellXps(8,"i7","NVIDIA GTX 1650",512,256,1000,1500);
        HpPavillion pc2 = new HpPavillion(16,"i7","NVIDIA RTX 2080",1024,512,1700,2200);
        ImplementVisitor imp = new ImplementVisitor();
        System.out.println(imp.getCostToDellXps(pc1));
        System.out.println(imp.getCostToHpPavillion(pc2));
    }
}
