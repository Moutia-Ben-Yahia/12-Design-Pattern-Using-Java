public interface subject {
    public void subscribe(observer obs);
    public void unsubscribe(observer obs);
    public void notifierAll();
}
