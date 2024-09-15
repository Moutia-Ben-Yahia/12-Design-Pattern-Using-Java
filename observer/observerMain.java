public class observerMain {
    public static void main(String[] args) {
        student adel = new student("adel");
        student yassine = new student("yessine");
        student twiti = new student("twiti");
        student khalil = new student("khalil");

        course java = new course("java course");
        java.subscribe(adel);
        java.subscribe(yassine);
        java.subscribe(twiti);
        java.subscribe(khalil);
        java.setAvailability(true);
    }
}
