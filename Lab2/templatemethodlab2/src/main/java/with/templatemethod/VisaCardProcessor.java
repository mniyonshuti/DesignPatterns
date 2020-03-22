package with.templatemethod;

public class VisaCardProcessor extends PaymentProcessor {

    @Override
    public boolean validatePaymentMethod(String paymentType, PaymentMethod paymentMethod) {
        VisaCard visaCard = (VisaCard) paymentMethod;
        System.out.println("Validate visa card with card number " + visaCard.getCreditCardNumber());
        return true;
    }

    @Override
    public void processPayment(PaymentMethod paymentMethod, Customer customer, double dollarAmount) {
        VisaCard visaCard = (VisaCard) paymentMethod;
        // logic to perform payment visa card
        System.out.println("Perform payment with visa card with card number " + visaCard.getCreditCardNumber()
                + " and amount $" + dollarAmount);

        // logic to notify customer
        System.out.println("Notify customer " + customer.getName() + " with email " + customer.getEmail()
                + " about visa credit card payment with card number " + visaCard.getCreditCardNumber());
    }
}
