import java.util.*;
public class course implements subject{
    private String name;
    private String availability;
    private List<observer> obsList = new ArrayList<observer>();
    public course(String name){
        this.name=name;
    }
    @Override public void subscribe(observer obs){
        this.obsList.add(obs);
    }
    @Override public void unsubscribe(observer obs){
        this.obsList.remove(obs);
    }
    @Override public void notifierAll(){
        for(observer o : this.obsList){
            o.update(this.availability);
        }
    }
    public void setAvailability(boolean bool){
        this.availability=this.name + (bool ? "available" : "not available");
        notifierAll();
    }
}
