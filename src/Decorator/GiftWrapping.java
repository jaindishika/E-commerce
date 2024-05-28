package Decorator;

public class GiftWrapping extends ProductDecorator{
    private double giftWrapAmount;
    public GiftWrapping(Feature feature, double giftWrapAmount) {
        super(feature);
        this.giftWrapAmount = giftWrapAmount;
    }
    @Override
    public double cost(double amount) {
        return feature.cost(amount) + giftWrapAmount;
    }

    @Override
    public String description() {
        return feature.description() + ", with gift wrapping";
    }
}
