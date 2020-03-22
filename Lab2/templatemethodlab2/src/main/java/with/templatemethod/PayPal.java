package with.templatemethod;

public class PayPal implements PaymentMethod {
    private String payPalAddress;

    public PayPal() {
    }

    public PayPal(String payPalAddress) {
        this.payPalAddress = payPalAddress;
    }

    public String getPayPalAddress() {
        return payPalAddress;
    }

    public void setPayPalAddress(String payPalAddress) {
        this.payPalAddress = payPalAddress;
    }
}
