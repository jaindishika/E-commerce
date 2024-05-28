package Command;

public class DiscountCommand implements CheckoutCommand{
    private OperationCommand command;
    private double discount;
    private Cart cart;

    public DiscountCommand(double discount, Cart cart) {
        this.command = new OperationCommand();
        this.discount = discount;
        this.cart = cart;
    }

    @Override
    public void execute() {
        command.discount(cart, discount);
    }
}
