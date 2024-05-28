package Command;

import java.util.List;

public class UpdateQuantityCommand implements CheckoutCommand{
    private OperationCommand operationCommand;
    private Cart cart;
    private Product product;

    public UpdateQuantityCommand(Cart cart, Product product) {
        this.cart = cart;
        this.product = product;
        this.operationCommand = new OperationCommand();
    }

    @Override
    public void execute() {
        operationCommand.updateItem(cart, product);
    }
}
