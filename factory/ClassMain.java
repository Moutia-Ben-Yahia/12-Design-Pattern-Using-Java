public class ClassMain{
    public static void main(String[] args) {
        F_Pc pavillion = PcFactory.createPC(2);
        System.out.println(pavillion.toString());
    }
}