import java.util.*;
public class proxy implements Internet{
    private List<String> bannedSites = Arrays.asList("youtube.com","twiter.com","facebook.com");
    private Internet internet = new LimitedInternet();
    public void connection(String Url) throws Exception{
        if(bannedSites.contains(Url.toLowerCase())){
            throw new Exception("connection faild");
        }
        else {
            internet.connection(Url);
        }
    }
}
