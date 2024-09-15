public class StrategyMain {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new PayPalPayment("556","2478"));
        context.executePayment(5);
    }
}
