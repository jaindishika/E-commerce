package Adapter;

public class GPayAdapter implements PaymentAdapter{
    private GooglePay googlePay;

    public GPayAdapter(GooglePay googlePay) {
        this.googlePay = googlePay;
    }

    @Override
    public void integratePaymentGateway(double amount) {
        googlePay.makePayment(amount);
    }
}
