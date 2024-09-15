public class LimitedInternet implements Internet {
    public void connection(String Url){
        System.out.println("connect to https://" + Url);
    }
}
