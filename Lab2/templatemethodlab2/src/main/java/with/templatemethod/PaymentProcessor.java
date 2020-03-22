package with.templatemethod;


public abstract class PaymentProcessor {

    public void processPaymentTemplate(double amount, String currency, String paymentType, Customer customer, PaymentMethod paymentMethod) {
        double dollarAmount = convertCurrency(currency, amount);
        boolean validation = validatePaymentMethod(paymentType, paymentMethod);
        if(validation) processPayment(paymentMethod, customer, dollarAmount);
    }

    public abstract boolean validatePaymentMethod(String paymentType, PaymentMethod paymentMethod);

    public abstract void processPayment(PaymentMethod paymentMethod, Customer customer, double dollarAmount);

    public double convertCurrency(String currency, double amount) {
        if (currency.contentEquals("EUR")) {
            amount = amount * 1.1;
            System.out.println("Convert " + amount + " " + currency + " to US dollars");
            return amount;
        }
        if (currency.contentEquals("INR")) { // Indian Rupee
            amount = amount * 0.014;
            System.out.println("Convert " + amount + " " + currency + " to US dollars");
            return amount;
        }
        return 0;
    }
}
