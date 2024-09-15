public class student implements observer{
    private String name;
    public student(String name){
        this.name =name;
    }
    @Override public void update(String message){
        System.out.println(this.name + "has new notification" + message);
    }
}
