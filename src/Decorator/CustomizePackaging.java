package Decorator;

public class CustomizePackaging extends ProductDecorator{
    private double customAmount;
    public CustomizePackaging(Feature feature, double customAmount) {
        super(feature);
        this.customAmount = customAmount;
    }
    @Override
    public double cost(double amount) {
        return feature.cost(amount) + customAmount;
    }

    @Override
    public String description() {
        return feature.description() + ", with Custom Packaging";
    }
}
