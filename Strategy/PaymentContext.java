public class PaymentContext {
    private PayStrategy strategy;
    public PaymentContext(PayStrategy strategy){
        this.strategy=strategy;
    }
    public void executePayment(int montant){
        if(strategy==null){
            System.out.println("aucun moyen de payment a été choisi");
        }else{
            strategy.pay(montant);
        }
    }
}
