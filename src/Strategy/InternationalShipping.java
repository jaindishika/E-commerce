package Strategy;

public class InternationalShipping implements ShippingMethod{

    @Override
    public double calculate(double productAmount, double ShippingAmount) {
        System.out.println("Final cost of Product with InternationalShipping : "+ (productAmount + ShippingAmount));
        return productAmount + ShippingAmount;
    }
}
