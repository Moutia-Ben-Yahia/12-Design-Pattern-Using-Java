public class mains {
    public static void main(String[] args){
        Pc pc1=new carteGraphique(new disquedur(new Ram(new BasicPc())));
        System.out.println("Price : "+pc1.getPrice());
        System.out.println("Description : "+pc1.getDescription());
    }
}
