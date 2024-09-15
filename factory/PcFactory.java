public class PcFactory {
    public static final int XPS =1;
    public static final int PAVILLION =2;
    public static F_Pc createPC(int Pc_Id){
        switch(Pc_Id){
            case XPS :
                return new Dell_Xps();
            case PAVILLION :
                return new pavillion();
            default:
                return null;
        }
    }
}
