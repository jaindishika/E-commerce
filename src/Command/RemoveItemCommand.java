package Command;

import java.util.List;

public class RemoveItemCommand implements CheckoutCommand{
    private OperationCommand command;
    private String productName;
    private Cart cart;

    public RemoveItemCommand(String productName, Cart cart) {
        this.productName = productName;
        this.cart = cart;
        this.command = new OperationCommand();
    }

    @Override
    public void execute() {
        command.removeItem(cart, productName);
    }
}
