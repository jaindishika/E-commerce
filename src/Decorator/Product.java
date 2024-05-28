package Decorator;

public class Product implements Feature{
    @Override
    public double cost(double amount) {
        return amount;
    }

    @Override
    public String description() {
        return "You got your product";
    }

}
