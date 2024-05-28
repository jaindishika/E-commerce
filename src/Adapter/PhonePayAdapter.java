package Adapter;

public class PhonePayAdapter implements PaymentAdapter{
    private PhonePay phonePay;

    public PhonePayAdapter(PhonePay phonePay) {
        this.phonePay = phonePay;
    }

    @Override
    public void integratePaymentGateway(double amount) {
        phonePay.makePayment(amount);
    }
}
