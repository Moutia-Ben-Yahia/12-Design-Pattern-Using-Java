public class creditCardPayment implements PayStrategy{
    private String numCard;
    private String passCard;
    public creditCardPayment (String id, String pass){
        this.passCard=pass; 
        this.numCard=id;
    }
    public void pay(int montant){ 
        System.out.println(" l'operation avec Credit Card effectue avec succeés");
    }
    @Override
    public String toString() {
        return "creditCardPayment [numCard=" + numCard + ", passCard=" + passCard + "]";
    }
    public String getNumCard() {
        return numCard;
    }
    public void setNumCard(String numCard) {
        this.numCard = numCard;
    }
    public String getPassCard() {
        return passCard;
    }
    public void setPassCard(String passCard) {
        this.passCard = passCard;
    }
    
}
