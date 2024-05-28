package Decorator;

public abstract class ProductDecorator implements Feature{
    protected Feature feature;
    private Product product;

    public ProductDecorator(Feature feature) {
        this.feature = feature;
    }

    @Override
    public double cost(double amount) {
        return product.cost(amount);
    }

    @Override
    public String description() {
        return product.description();
    }
}
