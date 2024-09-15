public class cashPayment implements PayStrategy{
    public void pay(int montant){ 
        System.out.println(" l'operation avec Cash Payment effectue avec succeés");
    }

    @Override
    public String toString() {
        return "cashPayment []";
    }
    
}
