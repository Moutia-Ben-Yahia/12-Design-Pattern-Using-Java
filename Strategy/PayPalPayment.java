public class PayPalPayment implements PayStrategy{
    private String id;
    private String pass;
    public PayPalPayment (String id, String pass){
        this.pass=pass; 
        this.id=id;
    }
    public void pay(int montant){ 
        System.out.println(" l'operation avec paypal effectue avec succeés");
    }
    @Override
    public String toString() {
        return "PayPalPayment [id=" + id + ", pass=" + pass + "]";
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
