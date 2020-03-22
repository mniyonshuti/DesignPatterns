package with.templatemethod;

public class PayPalProcessor extends PaymentProcessor {

    @Override
    public boolean validatePaymentMethod(String paymentType, PaymentMethod paymentMethod) {
        PayPal payPal = (PayPal) paymentMethod;
        // logic to validate paypal address
        System.out.println("Validate paypal address "+ payPal.getPayPalAddress());
        return true;
    }

    @Override
    public void processPayment(PaymentMethod paymentMethod, Customer customer, double dollarAmount) {
        PayPal payPal = (PayPal) paymentMethod;
        // logic to perform paypal payment
        System.out.println("Perform payment with paypal address "+payPal.getPayPalAddress()+" and amount $"+dollarAmount);

        // logic to notify customer
        System.out.println("Notify customer "+customer.getName()+" with email "+customer.getEmail()+" about paypal payment to address "+payPal.getPayPalAddress());
    }
}
